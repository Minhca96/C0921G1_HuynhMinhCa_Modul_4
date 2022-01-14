package com.codegym.controller;

import com.codegym.model.Login;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/mail")
    private String checkMail(Model model){
        model.addAttribute("login",new Login());
        return "home";
    }

//    @RequestMapping("/show")
//    private String show(Model model,@ModelAttribute Login login){
//        model.addAttribute("login",login);
//        return "view";
//    }

    @RequestMapping("/show")
    private ModelAndView show(@ModelAttribute("login") Login login){
    return  new ModelAndView("view","login",login);

    }

}
