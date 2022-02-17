package vn.codegym.case_study_model_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.case_study_model_4.service.ICustomerService;

@Controller
@RequestMapping("home")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping(" ")
    public String getHome(){
        return "home";
    }

}
