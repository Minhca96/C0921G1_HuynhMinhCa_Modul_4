package vn.codegym.ung_dung_blog.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.codegym.ung_dung_blog.dto.BlogDto;
import vn.codegym.ung_dung_blog.model.Blog;
import vn.codegym.ung_dung_blog.service.IBlogService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/blog/v1")
public class BlogRestController {
    @Autowired
    private IBlogService iBlogService;
@GetMapping("showBlog")
    public ResponseEntity<Iterable<Blog>> findAll() {
        List<Blog> blogList = (List<Blog>) iBlogService.getAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogList, HttpStatus.OK);
        }
    }
    @PostMapping("addBlog")
    public ResponseEntity add(@RequestBody BlogDto blogDto ){
    Blog blog = new Blog();
        BeanUtils.copyProperties(blogDto, blog);
        iBlogService.save(blog);
    return new  ResponseEntity( HttpStatus.CREATED);

    }



}
