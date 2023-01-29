package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.AuthBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestController {

    // Permet de s’identifier
    @PostMapping("/login")
    public static void login(@RequestBody AuthBean auth){

    }

    // Permet de s’enregistrer
    @PostMapping("/signin")
    public static void signin(@RequestBody AuthBean auth){

    }
}
