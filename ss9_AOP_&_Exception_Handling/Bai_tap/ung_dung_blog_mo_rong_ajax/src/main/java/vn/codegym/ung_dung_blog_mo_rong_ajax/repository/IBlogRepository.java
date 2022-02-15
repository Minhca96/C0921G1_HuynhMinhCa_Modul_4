package vn.codegym.ung_dung_blog_mo_rong_ajax.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.ung_dung_blog_mo_rong_ajax.model.Blog;

public interface IBlogRepository extends JpaRepository<Blog,Long> {
    Page<Blog> findByNameContaining(String s, Pageable pageable);
}
