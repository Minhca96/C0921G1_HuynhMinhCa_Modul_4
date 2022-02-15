package vn.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.Blog;
import vn.codegym.service.IBlogService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @GetMapping(" ")
    public ModelAndView getHome(){
        return new ModelAndView("list");
    }

    @GetMapping("display")
    public ResponseEntity<List<Blog>> getAllBlog(){
        List<Blog> blogList = iBlogService.getAllBlog();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

}
