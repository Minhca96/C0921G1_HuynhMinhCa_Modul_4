package com.codegym;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/show")
    private String show(){
        return "index";
    }

    @RequestMapping("/show")
    private String quality( ModelMap modelMap,Model model , @RequestParam int first,
                           @RequestParam String operator, @RequestParam int second){
        model.addAttribute("quality",quality(first,operator,second));
        return "quality";
    }


    private double quality(int first,String operator,int second){

        switch (operator){
            case "+":
                return first + second;

            case "-":
                return first - second;

            case "*":
                return first * second;

            case "/":
                if(second==0){
                    throw new RuntimeException("Can't divide by zero");
                }else{
                    return first / second;

                }
            default:
                throw new RuntimeException("Invalid operation");

        }

    }

}
