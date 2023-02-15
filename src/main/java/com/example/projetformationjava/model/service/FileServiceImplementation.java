package com.example.projetformationjava.model.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.UUID;

@Service
public class FileServiceImplementation implements FileService{
    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {

        // File name
        String name = file.getOriginalFilename();

        // Extension
        String extension = name.substring(name.lastIndexOf(".") + 1);

        // Extension accepted
        String[] extensionAccepted = {"jpg", "png", "jpeg", "svg"};

        if(!Arrays.asList(extensionAccepted).contains(extension)){
            System.out.println(extension);
            throw new IOException("Could not save image file of type: " + extension);
        }

        // Creer une chaine de caractere unique
        UUID uuid = UUID.randomUUID();

        // Fullpath
        String filePath = path + uuid + "." + extension;
        String filePathReturn = "/" + filePath;
        // Create folder if not exists
        File f = new File(path);
        if(!f.exists()){
            f.mkdir();
        }
    System.out.println(Paths.get(filePath));
        // File copy
        try{
            Files.copy(file.getInputStream(), Paths.get(filePath));
        }catch (Exception e){
            System.out.println("Erreur de copy");
            e.printStackTrace();
        }

        return filePathReturn;
    }
}
