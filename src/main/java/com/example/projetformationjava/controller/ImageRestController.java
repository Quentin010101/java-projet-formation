package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.CategoryBean;
import com.example.projetformationjava.model.bean.ImageBean;
import com.example.projetformationjava.model.service.ImageService;
import org.apache.coyote.Response;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin()
@RequestMapping("/image")
public class ImageRestController {

    // Permet de recuperer les 9 meilleurs images de la semaine
    @GetMapping("/topimage")
    public List<ImageBean> getTopImage() throws IOException {
        System.out.println("topImage");
//        List<ImageBean> liste = new ArrayList<>();
        // --------------
        List<ImageBean> liste = ImageService.getTopImage();
        // --------------
        return liste;
    }

    // Permet de recuperer les 3 meilleurs categories contenant 4 images chacune (pour thumnail)
    @GetMapping("/topcategory")
    public List<CategoryBean> getTopCategory(){
        System.out.println("topCategory");
//        List<CategoryBean> listeCategory = new ArrayList<>();
        // --------------
        List<CategoryBean> listeCategory = ImageService.getTopCategory();
        // --------------
        System.out.println(listeCategory);
        return listeCategory;
    }

    // Permet de recuperer toutes les categories contenant 4 images chacune (pour thumnail)
    @GetMapping("/categorylist")
    public List<CategoryBean> getCategoryList(){
        List<CategoryBean> listeCategory = new ArrayList<>();
        // --------------

        // --------------
        return listeCategory;
    }

    // Permet de recuperer une categorie avec toutes ces images
    @GetMapping("/category")
    public CategoryBean getCategoryList(int id){
        CategoryBean category = new CategoryBean();
        // --------------

        // --------------
        return category;
    }

    // Permet de recuperer  les images utilisateurs
    @GetMapping("/feed")
    public List<ImageBean> getFeed(int id){
        List<ImageBean> listImage = new ArrayList<>();
        // --------------

        // --------------
        return listImage;
    }

    // Permet de sauvegarder  une image
    @PostMapping("/save")
    public void save(@RequestParam("file")MultipartFile file) throws IOException {
        System.out.println("/save");
        // --------------
        // !!!  passer en FILE !!! si stockage en java
        // --------------

        // Recupere le path ou stocker l'image
        String pathDirectory = new ClassPathResource("static/image/").getFile().getAbsolutePath();
        System.out.println(pathDirectory);

        // Recupere l'extension
        String fileName = file.getOriginalFilename();
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

        // Creer une chaine de caractere unique
        UUID uuid = UUID.randomUUID();

        // Store image
        Files.copy(file.getInputStream(), Paths.get(pathDirectory + File.separator + uuid  + "." + extension));

//        BufferedImage image = ImageIO.read(new File(pathDirectory));
//        System.out.println(image);
    }

    // Permet d'afficher une image
//    @GetMapping("get/{name}")
//    public Response getImage(@PathVariable("name") String name) throws FileNotFoundException {
//        final File dbImage = ResourceUtils.getFile("image/tree.png");
//
//    }

}
