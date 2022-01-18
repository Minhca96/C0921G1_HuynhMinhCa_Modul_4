package vn.codegym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.demo.model.Blog;
import vn.codegym.demo.repository.IBlogRepository;

import java.util.List;
import java.util.Optional;


@Service
public class BlogService implements IBlogService {
    @Autowired
   private IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAll() {
        return (List<Blog>) iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Optional<Blog> getById(Integer id) {
      return   iBlogRepository.findById(id);
    }

    @Override
    public void delete(Blog blog) {
        iBlogRepository.delete(blog);
    }
}
