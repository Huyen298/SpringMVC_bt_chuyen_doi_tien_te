package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class Conversion {
    @GetMapping("/conversion")
        public String conversion(){
        return "index";
    }
    @PostMapping("/vnd")
    public String result(@RequestParam String usd, @RequestParam String rate, Model model){
        float rs = Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("result",rs);
        return "usd";
    }
}
