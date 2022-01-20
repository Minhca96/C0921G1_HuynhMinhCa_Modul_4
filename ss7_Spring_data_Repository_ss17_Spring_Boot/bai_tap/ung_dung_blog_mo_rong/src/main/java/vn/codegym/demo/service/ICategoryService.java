package vn.codegym.demo.service;

import vn.codegym.demo.model.Blog;
import vn.codegym.demo.model.Category;

import java.awt.print.Pageable;
import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
