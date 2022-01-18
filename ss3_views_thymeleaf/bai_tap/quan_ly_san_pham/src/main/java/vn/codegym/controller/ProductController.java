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
    @GetMapping("showAdd")
    private  String showAdd(Model model){
        model.addAttribute("product", new Product());
      return "create" ;
    }

    @PostMapping("create")
    private String create(Product product,RedirectAttributes redirect){
        product.setId((int) (Math.random()*100));
        redirect.addFlashAttribute("messager","create complete");
        iProductService.add(product);
        return "redirect:/product";
    }


    @GetMapping ("/{id}/edit")
    private String edit(Model model,@PathVariable int id){
        Product product = iProductService.getById(id);
        model.addAttribute("product",product);
        return "edit";

    }
    @PostMapping("update")
    private String update( Product product,RedirectAttributes redirect){
        redirect.addFlashAttribute("messager","update complete");
        iProductService.edit(product.getId(),product);
        return "redirect:/product";

    }
    @GetMapping("/{id}/delete")
    private String delete(@PathVariable int id, RedirectAttributes redirect){
        redirect.addFlashAttribute("messager","delete complete");
        iProductService.remote(id);
        return "redirect:/product";
    }

    @GetMapping("/search")
    private  String seach(Model model,@RequestParam String keyword){
        List<Product> productList = iProductService.search(keyword);
        model.addAttribute("productList",productList);
        return "index";

    }

    @GetMapping("/{id}/view")
    private String view(Model model,@PathVariable int id){
        Product product = iProductService.getById(id);
        model.addAttribute("product",product);
        return "view";
    }




}
