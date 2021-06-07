package com.sharkit.maxup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main_Controller {

    @GetMapping("/")
    public String greeting( Model model) {
        return "index";
    }
    @GetMapping("/register")
    public String register( Model model) {
        return "register";
    }

    @GetMapping("/login")
    public String login( Model model) {
        return "login";
    }
}

