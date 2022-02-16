package vn.codegym.ung_dung_blog_mo_rong.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_blog_mo_rong.model.Blog;
import vn.codegym.ung_dung_blog_mo_rong.repository.IBlogRepository;
import vn.codegym.ung_dung_blog_mo_rong.service.IBlogService;
@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return iBlogRepository.findAll();
    }
}
