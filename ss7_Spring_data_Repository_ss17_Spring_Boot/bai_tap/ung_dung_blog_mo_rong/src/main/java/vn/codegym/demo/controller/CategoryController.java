package vn.codegym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import vn.codegym.demo.model.Category;
import vn.codegym.demo.service.IBlogService;
import vn.codegym.demo.service.ICategoryService;

@Controller
public class CategoryController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;


    @ModelAttribute("Categorys")
    public Iterable<Category> provinces(){
        return iCategoryService.findAll();
    }
}
