package vn.codegym.ung_dung_blog_mo_rong_ajax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_blog_mo_rong_ajax.model.Blog;
import vn.codegym.ung_dung_blog_mo_rong_ajax.repository.IBlogRepository;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findByNameContaining(String s, Pageable pageable) {
        return iBlogRepository.findByNameContaining(s,pageable);
    }
}
