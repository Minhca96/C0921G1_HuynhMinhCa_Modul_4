package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Blog;
import vn.codegym.repository.IBlogRepository;

import java.util.List;
@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAll() {
        return null;
    }

    @Override
    public Blog findById(int id) {
        return null;
    }

    @Override
    public void save(Blog blog) {

    }

    @Override
    public void remove(int id) {

    }
}
