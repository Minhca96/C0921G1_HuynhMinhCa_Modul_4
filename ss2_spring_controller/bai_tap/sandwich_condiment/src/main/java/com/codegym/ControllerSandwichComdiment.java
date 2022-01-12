package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerSandwichComdiment {
    @GetMapping("/sandwich")
    private String show(Model model){
    model.addAttribute("Lettuce","Lettuce");
    model.addAttribute("Tomato","Tomato");
    model.addAttribute("Mustard","Mustard");
    model.addAttribute("Sprouts","Sprouts");
    return "index";
    }

    @RequestMapping("/sandwich")
    private  String make(Model model,String a){
        model.addAttribute("show",a);
        return "make";
    }


}
