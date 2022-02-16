package vn.codegym.ung_dung_blog_mo_rong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.ung_dung_blog_mo_rong.model.Blog;
import vn.codegym.ung_dung_blog_mo_rong.service.IBlogService;

import java.util.List;

@RestController
@RequestMapping("api/blog/v1")
public class BlogRestController {
    @Autowired
    private IBlogService iBlogService;
    @GetMapping(" ")
    public ModelAndView getHome(){
        return new ModelAndView("list");
    }

    @GetMapping("display")
    public ResponseEntity<Iterable<Blog>> getAll(){
        List<Blog> blogList = (List<Blog>) iBlogService.findAll();
        if(blogList.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return  new ResponseEntity<>(blogList,HttpStatus.OK);
        }
    }
}
