package vn.codegym.gio_hang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.gio_hang.model.Cart;
import vn.codegym.gio_hang.model.Product;
import vn.codegym.gio_hang.service.IProductService;

import java.util.Optional;

@Controller
@SessionAttributes("cart")

public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setupCart(){
        return new Cart();
    }

    @GetMapping("getAll")
    public String getAll(Model model){
        model.addAttribute("productList",iProductService.getAll());
        return "home";
    }
    @GetMapping("add/{id}")
    public  String addToCart(@PathVariable Long id, @ModelAttribute Cart cart){
        Optional<Product> product = iProductService.getById(id);
    if(!product.isPresent()){
        return "error";
    }
    cart.addProduct(product.get());
    return "redirect:/getAll";
    }
}
