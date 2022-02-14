package vn.codegym.ung_dung_blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_blog.model.Category;
import vn.codegym.ung_dung_blog.repository.ICategoryRepository;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public Iterable<Category> getAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Optional<Category> getById(Long id) {
        return iCategoryRepository.findById(id);
    }
}
