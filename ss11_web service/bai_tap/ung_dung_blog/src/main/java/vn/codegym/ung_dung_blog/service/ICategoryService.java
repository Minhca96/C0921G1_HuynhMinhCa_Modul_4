package vn.codegym.ung_dung_blog.service;

import vn.codegym.ung_dung_blog.model.Category;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> getAll();

    Optional<Category> getById(Long id);
}
