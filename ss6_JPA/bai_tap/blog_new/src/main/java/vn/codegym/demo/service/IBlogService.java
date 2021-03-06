package vn.codegym.demo.service;

import vn.codegym.demo.model.Blog;

import java.util.List;
import java.util.Optional;


public interface IBlogService  {


    List<Blog> findAll();

    void save(Blog blog);

    Optional<Blog> getById(Integer id);

    void delete(Blog blog);
}
