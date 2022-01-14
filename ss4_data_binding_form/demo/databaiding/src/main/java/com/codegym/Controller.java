package com.codegym;


import model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/show")
    private String show(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping("/display")
    private String display(Model model, @ModelAttribute User user){
        model.addAttribute("user",user);
        return "display";
    }


}
