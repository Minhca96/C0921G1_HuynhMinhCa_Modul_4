package vn.codegym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.demo.model.Blog;
import vn.codegym.demo.repository.IBlogRepository;


@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findByCategoryId(Long aLong, Pageable pageable) {
        return iBlogRepository.findByCategoryId(aLong,pageable);
    }

    @Override
    public Page<Blog> findByNameContaining(String s, Pageable pageable) {
        return iBlogRepository.findByNameContaining(s,pageable);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog getById(Long id) {
        return iBlogRepository.getById(id);
    }

    @Override
    public void delete(Long id) {
        iBlogRepository.deleteById(id);
    }
}
