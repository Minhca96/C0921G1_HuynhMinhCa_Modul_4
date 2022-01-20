package vn.codegym.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.demo.model.Blog;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByCategoryId(Long aLong, Pageable pageable);

    Page<Blog> findByNameContaining(String s, Pageable pageable);

    void save(Blog blog);

    Blog getById(Long id);

    void delete(Long id);
}
