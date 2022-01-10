package com.moneyconversion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.HashMap;
import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping({"","/greeting"})
    public String show() {
        return "index";
    }


    @PostMapping ({"","/greeting1"})
    protected String dictionary(@RequestParam String keyword, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getKey().equals(keyword)) {
                model.addAttribute("result", entry.getValue());
            }
        }
        return "index";
    }


}

