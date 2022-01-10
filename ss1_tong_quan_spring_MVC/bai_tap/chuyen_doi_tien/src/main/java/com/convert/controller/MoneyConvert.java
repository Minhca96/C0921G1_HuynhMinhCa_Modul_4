package com.convert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyConvert {
    @GetMapping({"","/convert"})
    public String show(){
    return "index";
    }

    @PostMapping({"","/convert"})
    public String result(@RequestParam int number, Model model){
    model.addAttribute("result",number*23000);
    return "index";
    }
}
