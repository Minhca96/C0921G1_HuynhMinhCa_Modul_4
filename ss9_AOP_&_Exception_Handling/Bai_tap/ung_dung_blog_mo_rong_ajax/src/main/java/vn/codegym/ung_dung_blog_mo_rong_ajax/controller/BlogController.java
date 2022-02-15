package vn.codegym.ung_dung_blog_mo_rong_ajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.codegym.ung_dung_blog_mo_rong_ajax.model.Blog;
import vn.codegym.ung_dung_blog_mo_rong_ajax.service.IBlogService;
import vn.codegym.ung_dung_blog_mo_rong_ajax.service.ICategoryService;

import java.util.Optional;


@CrossOrigin(origins = "*")
@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("list")
    private String getAll(Model model, Optional<String> key_search,
                          @PageableDefault(size=2)Pageable pageable) {
        model.addAttribute("categoryList",iCategoryService.findAll());
        // th ko nhap vao o tim kiem
        if(!key_search.isPresent() || key_search.get().equals("")){
            model.addAttribute("blogList",iBlogService.findAll(pageable));

    }else {
            // th nhap vao o tim kiem
            model.addAttribute("key_search",key_search.get());
            model.addAttribute("blogList",iBlogService.findByNameContaining(key_search.get(),pageable));
        }
        return "blogList";

}
}
