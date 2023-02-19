package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.dao.CategoryBean;
import com.example.projetformationjava.model.bean.dao.ImageBean;
import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.MessageBean;
import com.example.projetformationjava.model.service.CategoryService;
import com.example.projetformationjava.model.service.FileServiceImplementation;
import com.example.projetformationjava.model.service.ImageService;
import com.example.projetformationjava.model.service.UserService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;


import java.lang.reflect.Array;
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
    @PostMapping("/savefile")
    public String save(HttpSession httpSession, @RequestParam("file")MultipartFile file)
    {
        System.out.println("/savefile");

        // Upload Image
        try{
            String filePath = this.fileService.uploadImage(file, "image");
            return filePath;

        }
        catch(Exception e){
            System.out.println("error");
            e.printStackTrace();
            return null;
        }


    }

    @PostMapping("/save")
    public MessageBean save(HttpSession httpSession, @RequestParam("image")ImageBean image)
    {
        System.out.println("/save");
        System.out.println(image);

//
//        UserBean user = userService.getUserBySession(httpSession.getId());
//        if(user == null){
//            return new MessageBean(false, "You need to be connected");
//        }
//
//        if(title.trim().equals("") || description.trim().equals("")){
//            return new MessageBean(false, "Title and description are needed.");
//        }
//
//        String filePath = "";
//        // Upload Image
//        try{
//            filePath = this.fileService.uploadImage(file, "image");
//        }
//        catch(Exception e){
//            e.printStackTrace();
//            return new MessageBean(false, e.getMessage());
//        }
//
//        // Save image in DB
//        ImageBean image = new ImageBean();
//        image.setImagePath(filePath);
//        image.setDescription(description);
//        image.setTitle(title);
//        image.setUser(userService.getUserBySession(httpSession.getId()));
//        imageService.saveImage(image);


        return new MessageBean(true, "Your file has been upload.");

    }


}
