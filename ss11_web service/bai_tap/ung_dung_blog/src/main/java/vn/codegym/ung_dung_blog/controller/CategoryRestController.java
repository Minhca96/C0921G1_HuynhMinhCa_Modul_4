package vn.codegym.ung_dung_blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.codegym.ung_dung_blog.model.Category;
import vn.codegym.ung_dung_blog.service.ICategoryService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/category/v1")
public class CategoryRestController {
@Autowired
    private ICategoryService icategoryService;
@GetMapping("showCategory")
    public ResponseEntity<Iterable<Category>> findAll(){
    List<Category> categoryList = (List<Category>) icategoryService.getAll();
    if(categoryList.isEmpty()){
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }else{
        return  new ResponseEntity<>(categoryList,HttpStatus.OK);
    }
}
@GetMapping("/{id}")
public ResponseEntity<Category> getById(@PathVariable Long id){
    Optional<Category> category = icategoryService.getById(id);
    if(!category.isPresent()){
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }else{
        return  new ResponseEntity<>(category.get(),HttpStatus.OK);
    }

}
}
