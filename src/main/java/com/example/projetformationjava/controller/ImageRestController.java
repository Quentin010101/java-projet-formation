package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.dao.CategoryBean;
import com.example.projetformationjava.model.bean.dao.ImageBean;
import com.example.projetformationjava.model.bean.dao.PivotCategoryImage;
import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.HomePageCount;
import com.example.projetformationjava.model.bean.dto.ReturnMessageBean;
import com.example.projetformationjava.model.service.*;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;


import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping("/image")
public class ImageRestController {
    @Autowired
    private ImageService imageService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UserService userService;
    @Autowired
    private FileServiceImplementation fileService;

    @Autowired
    private PivotCategoryImageService pivotCategoryImageService;


    // Permet de recuperer les 9 meilleurs images de la semaine
    @GetMapping("/topimage")
    public List<ImageBean> getTopImage() throws IOException {
        System.out.println("topImage");

        return imageService.getTopImage();
    }

    // Permet de recuperer les 3 meilleurs categories contenant 4 images chacune (pour thumnail)
    @GetMapping("/topcategory")
    public List<CategoryBean> getTopCategory(){
        System.out.println("topCategory");

        return categoryService.getTopCategory();
    }

    // Permet de recuperer toutes les categories contenant 4 images chacune (pour thumnail)
    @GetMapping("/categorylist")
    public List<CategoryBean> getCategoryList(){
        System.out.println("categorylist");

        return categoryService.getCategoryList();
    }

    @GetMapping("/categoryall")
    public List<CategoryBean> getCategoryAll(){
        System.out.println("categoryall");

        return categoryService.getAllCategory();
    }

    // Permet de recuperer une categorie avec toutes ces images
    @GetMapping("/category")
    public CategoryBean getCategory(String type){
        System.out.println("category");

        return categoryService.getCategory(type);
    }

    // Permet de recuperer  les images utilisateurs
    @GetMapping("/feed")
    public List<ImageBean> getFeed(HttpSession httpSession){
        System.out.println("feed");

        UserBean user = userService.getUserBySession(httpSession.getId());

        return imageService.getFeed(user);
    }

    // Permet de sauvegarder  une image
    @PostMapping("/save")
    public ReturnMessageBean save(HttpSession httpSession,
                            @RequestParam MultipartFile file,
                            @RequestParam String title,
                            @RequestParam String description,
                            @RequestParam List<Integer> categories)
    {

        System.out.println("/save");


        UserBean user = userService.getUserBySession(httpSession.getId());
        if(user == null){
            return new ReturnMessageBean(false, "You need to be connected.");
        }
        if(title.equals("") || description.equals("")){
            return new ReturnMessageBean(false, "Title and description required.");
        }
        if(file.isEmpty()){
            return new ReturnMessageBean(false, "Image is required.");
        }


        try{
            // Upload Image
            String filePath = this.fileService.uploadImage(file, "image");

            // Save image in DB
            ImageBean image = new ImageBean();

            image.setImagePath(filePath);
            image.setDescription(description);
            image.setTitle(title);
            image.setUser(userService.getUserBySession(httpSession.getId()));

            ImageBean imageDb = imageService.saveImage(image);

            for(int element: categories){
                PivotCategoryImage p = new PivotCategoryImage();
                p.setCategoryid(element);
                p.setImageid(imageDb.getImageid());
                pivotCategoryImageService.addCategoryToImage(p);
            }

            return new ReturnMessageBean(true, "Your image has been uploaded.");

        }
        catch(Exception e){
            e.printStackTrace();
            return new ReturnMessageBean(false, e.getMessage());
        }




    }

    // Permet de recuper le nb de user, category et image
    @GetMapping("/homepagecount")
    public HomePageCount getCount(){
        System.out.println("homepagecount");
        long nbimage = imageService.getCountImage();
        long nbCategories = categoryService.getCountCategory();
        long nbUsers = userService.getCountUser();

        return new HomePageCount(nbimage, nbCategories, nbUsers);
    }


}
