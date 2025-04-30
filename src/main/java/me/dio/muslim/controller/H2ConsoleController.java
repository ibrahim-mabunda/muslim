package me.dio.muslim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class H2ConsoleController {

    @GetMapping("/h2")
    public String redirectToH2Console() {
        return "redirect:/h2-console";
    }
}