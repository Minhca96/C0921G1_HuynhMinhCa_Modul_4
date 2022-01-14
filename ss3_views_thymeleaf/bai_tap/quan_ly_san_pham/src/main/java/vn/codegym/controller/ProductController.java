package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.model.Product;
import vn.codegym.service.IProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping("")
    private String getAll(Model model){
        List<Product> productList = iProductService.findAll();
        model.addAttribute("productList",productList);
        return "index";

    }


}
