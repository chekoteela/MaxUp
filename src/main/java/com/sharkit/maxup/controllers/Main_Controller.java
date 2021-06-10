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
    @GetMapping("/apple")
    public String apple( Model model) {
        return "apple";
    }
    @GetMapping("/askfm")
    public String askfm( Model model) {
        return "askfm";
    }
    @GetMapping("/clubhouse")
    public String clubhouse( Model model) {
        return "clubhouse";
    }
    @GetMapping("/coub")
    public String coub( Model model) {
        return "coub";
    }
    @GetMapping("/discord")
    public String discord( Model model) {
        return "discord";
    }
    @GetMapping("/dzen")
    public String dzen( Model model) {
        return "dzen";
    }
    @GetMapping("/facebook")
    public String facebook( Model model) {
        return "facebook";
    }
    @GetMapping("/flickr")
    public String flickr( Model model) {
        return "flickr";
    }
    @GetMapping("/google")
    public String google( Model model) {
        return "google";
    }
    @GetMapping("/instagram")
    public String instagram( Model model) {
        return "instagram";
    }
    @GetMapping("/likee")
    public String likee( Model model) {
        return "likee";
    }
    @GetMapping("/linkedin")
    public String linkedin( Model model) {
        return "linkedin";
    }
    @GetMapping("/medium")
    public String medium( Model model) {
        return "medium";
    }
    @GetMapping("/reddit")
    public String reddit( Model model) {
        return "reddit";
    }
    @GetMapping("/quora")
    public String quora( Model model) {
        return "quora";
    }
    @GetMapping("/ok")
    public String ok( Model model) {
        return "ok";
    }

    @GetMapping("/soundcloud")
    public String soundcloud( Model model) {
        return "soundcloud";
    }
    @GetMapping("/snapchat")
    public String snapchat( Model model) {
        return "snapchat";
    }

    @GetMapping("/spotify")
    public String spotify( Model model) {
        return "spotify";
    }

    @GetMapping("/steam")
    public String steam( Model model) {
        return "steam";
    }
    @GetMapping("/telegram")
    public String telegram( Model model) {
        return "telegram";
    }

    @GetMapping("/tt")
    public String tt( Model model) {
        return "tt";
    }

    @GetMapping("/tumblr")
    public String tumblr( Model model) {
        return "tumblr";
    }

    @GetMapping("/twitch")
    public String twitch( Model model) {
        return "twitch";
    }

    @GetMapping("/twitter")
    public String twitter( Model model) {
        return "twitter";
    }

    @GetMapping("/vimeo")
    public String vimeo( Model model) {
        return "vimeo";
    }

    @GetMapping("/vk")
    public String vk( Model model) {
        return "vk";
    }

    @GetMapping("/website_traffic")
    public String website_traffic( Model model) {
        return "website_traffic";
    }

    @GetMapping("/yandex")
    public String yandex( Model model) {
        return "yandex";
    }

    @GetMapping("/youtube")
    public String youtube( Model model) {
        return "youtube";
    }
}

