package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
    @GetMapping("/{id}/delete")
    private String delete(@PathVariable int id, RedirectAttributes redirect){
        redirect.addFlashAttribute("message","Delete success");
        iProductService.delete(id);
        return "redirect:/product";
    }
    @GetMapping("search")
    private String search(Model model,@RequestParam String keyword){
        List<Product> productList = iProductService.search(keyword);
        model.addAttribute("productList",productList);
        return "index";
    }
    @GetMapping("create")
    private String addShow(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("add")
    private  String add(Product product, RedirectAttributes redirect){
        product.setId((int) (Math.random()*100));
        redirect.addFlashAttribute("message","create product success");
        iProductService.save(product);
        return "redirect:/product";
    }
    @GetMapping("{id}/editshow")
    private String editShow(Model model,@PathVariable int id){
       Product product = iProductService.getById(id);
        model.addAttribute("product",product );
        return "edit";
    }
    @PostMapping("edit")
    private  String edit(Product product, RedirectAttributes redirect){
        redirect.addFlashAttribute("message","edit product success");
        iProductService.update(product);
        return "redirect:/product";
    }
    @GetMapping("{id}/view")
    private String view(@PathVariable int id,Model model){
        Product product = iProductService.getById(id);
        model.addAttribute("product",product);
        return "view";
    }
}
