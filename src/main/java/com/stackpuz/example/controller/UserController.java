package com.stackpuz.example.controller;

import com.stackpuz.example.entity.User;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (!result.hasErrors()) {
            model.addAttribute("pass", true);
        }
        return "index";
    }
}