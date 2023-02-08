package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.CategoryBean;
import com.example.projetformationjava.model.bean.ImageBean;
import com.example.projetformationjava.model.service.CategoryService;
import com.example.projetformationjava.model.service.ImageService;
import com.example.projetformationjava.utils.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/image")
public class ImageRestController {
    @Autowired
    private ImageService imageService;
    @Autowired
    private CategoryService categoryService;

    // Permet de recuperer les 9 meilleurs images de la semaine
    @GetMapping("/topimage")
    public List<ImageBean> getTopImage() throws IOException {
        System.out.println("topImage");

        List<ImageBean> liste = imageService.getTopImage();
        return liste;
    }

    // Permet de recuperer les 3 meilleurs categories contenant 4 images chacune (pour thumnail)
    @GetMapping("/topcategory")
    public List<CategoryBean> getTopCategory(){
        System.out.println("topCategory");

        List<CategoryBean> listeCategory = categoryService.getTopCategory();
        return listeCategory;
    }

    // Permet de recuperer toutes les categories contenant 4 images chacune (pour thumnail)
    @GetMapping("/categorylist")
    public List<CategoryBean> getCategoryList(){
        System.out.println("categorylist");

        List<CategoryBean> listeCategory = categoryService.getCategoryList();

        return listeCategory;
    }

    // Permet de recuperer une categorie avec toutes ces images
    @GetMapping("/category")
    public CategoryBean getCategory(String type){
        System.out.println("category");
//        CategoryBean category = new CategoryBean();
        // --------------
        CategoryBean category = categoryService.getCategory(type);
        // --------------
        return category;
    }

    // Permet de recuperer  les images utilisateurs
    @GetMapping("/feed")
    public List<ImageBean> getFeed(int id){
        System.out.println("feed");
//        List<ImageBean> listImage = new ArrayList<>();
        // --------------
        List<ImageBean> liste = new ArrayList<>();
        // --------------
        return liste;
    }

    // Permet de sauvegarder  une image
    @PostMapping("/save")
    public void save(@RequestParam("file")MultipartFile file,
                     @RequestParam("title")String title,
                     @RequestParam("description")String description)
            throws IOException {

        System.out.println("/save");

        // Recupere le path ou stocker l'image
        String pathDirectory = new ClassPathResource("static/image/").getFile().getAbsolutePath();

        // Recupere l'extension
        String fileOriginalName = file.getOriginalFilename();
        String extension = fileOriginalName.substring(fileOriginalName.lastIndexOf(".") + 1);
        String[] extensionAccepted = {"jpg", "png", "jpeg", "svg"};
        System.out.println(extension);

        if(!Arrays.asList(extensionAccepted).contains(extension)){
            System.out.println(extension);
            throw new IOException("Could not save image file of type: " + fileOriginalName);
        }
        // Creer une chaine de caractere unique
        UUID uuid = UUID.randomUUID();

        // Store image
        FileUploadUtil.saveFile(pathDirectory, uuid + "." + extension, file);


    }

}
