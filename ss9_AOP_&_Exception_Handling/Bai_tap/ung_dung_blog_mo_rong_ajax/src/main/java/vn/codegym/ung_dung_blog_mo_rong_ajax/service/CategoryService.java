package vn.codegym.ung_dung_blog_mo_rong_ajax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_blog_mo_rong_ajax.model.Category;
import vn.codegym.ung_dung_blog_mo_rong_ajax.repository.ICategoryRepository;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }
}
