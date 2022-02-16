package vn.codegym.ung_dung_blog_mo_rong.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_blog_mo_rong.repository.ICategoryRepository;
import vn.codegym.ung_dung_blog_mo_rong.service.ICategoryService;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
}
