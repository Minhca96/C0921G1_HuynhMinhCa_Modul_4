package vn.codegym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.demo.model.Blog;
import vn.codegym.demo.service.IBlogService;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping({"","/list"})
    public String getAll(Model model){
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        return "index";
    }


    @GetMapping({"create"})
    private String createshow(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("add")
    public String add(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message","add thanh cong");
        return "redirect:/blog";
    }
    @GetMapping ("{id}/editshow")
    public String editshow(Model model,@PathVariable Integer id){

        Optional<Blog> blog = iBlogService.getById(id);
        model.addAttribute("blog",blog);
        return "edit";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "edit thanh cong");
        return "redirect:/blog";
    }

    @GetMapping ("{id}/delete")
    public String deleteShow(Model model,@PathVariable Integer id){
        Optional<Blog> blog = iBlogService.getById(id);
        model.addAttribute("blog",blog);
        return "delete";
    }
    @PostMapping("delete")
    public String delete(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.delete(blog);
        redirectAttributes.addFlashAttribute("message", "delete thanh cong");
        return "redirect:/blog";
    }
}

