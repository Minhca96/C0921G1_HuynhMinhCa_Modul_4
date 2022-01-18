package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.model.Blog;

@Controller
@RequestMapping("blog")
public class BlogController {
    @GetMapping({"","createshow"})
    private String createshow(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }
}
