package vn.codegym.ung_dung_blog_mo_rong_ajax.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.ung_dung_blog_mo_rong_ajax.model.Blog;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByNameContaining(String s, Pageable pageable);
}
