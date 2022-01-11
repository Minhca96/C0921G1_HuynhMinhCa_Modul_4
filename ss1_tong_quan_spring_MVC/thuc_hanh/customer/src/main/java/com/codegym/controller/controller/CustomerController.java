package com.codegym.controller.controller;

import com.codegym.controller.model.Customer;
import com.codegym.controller.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private  ICustomerService iCustomerService;

    @GetMapping({"","/customer"} )
    private ModelAndView getAllCustomer(){
        return new ModelAndView("index","listCustomer",iCustomerService.getAll());
    }

    @GetMapping({"/customer/{id}"})
    private ModelAndView deleteCustomer(@PathVariable int id){
        return new ModelAndView("index","listCustomer",iCustomerService.delete(id));
    }
}
