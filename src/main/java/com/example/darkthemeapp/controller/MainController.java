package com.example.darkthemeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Dark Theme Application");
        return "index";
    }
    
    @PostMapping("/action1")
    public String handleAction1(Model model) {
        model.addAttribute("message", "Action 1 was performed successfully!");
        return "index";
    }
    
    @PostMapping("/action2")
    public String handleAction2(Model model) {
        model.addAttribute("message", "Action 2 was performed successfully!");
        return "index";
    }
    
    @PostMapping("/action3")
    public String handleAction3(@RequestParam String inputText, Model model) {
        model.addAttribute("message", "Received: " + inputText);
        return "index";
    }
}
