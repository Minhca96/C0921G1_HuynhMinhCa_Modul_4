package vn.codegym.ung_dung_blog.service;

import vn.codegym.ung_dung_blog.model.Blog;

public interface IBlogService {
    Iterable<Blog> getAll() ;

    void save(Blog blog);
}
