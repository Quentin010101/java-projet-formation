package com.example.projetformationjava.model.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface FileService {

    String uploadImage(MultipartFile file, String directory) throws IOException;

}
