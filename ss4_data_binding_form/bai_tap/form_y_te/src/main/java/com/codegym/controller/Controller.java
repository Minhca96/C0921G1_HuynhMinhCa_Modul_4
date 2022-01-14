package com.codegym.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/home")
    private String show(){
        return "home";
    }

}
