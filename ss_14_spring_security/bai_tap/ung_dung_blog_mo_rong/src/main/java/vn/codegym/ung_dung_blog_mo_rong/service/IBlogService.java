package vn.codegym.ung_dung_blog_mo_rong.service;

import vn.codegym.ung_dung_blog_mo_rong.model.Blog;

public interface IBlogService {
    Iterable<Blog> findAll();
}
