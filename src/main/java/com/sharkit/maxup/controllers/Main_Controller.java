package com.sharkit.maxup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main_Controller {

    @GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("name", "name");
        return "dist/index";
    }
}

