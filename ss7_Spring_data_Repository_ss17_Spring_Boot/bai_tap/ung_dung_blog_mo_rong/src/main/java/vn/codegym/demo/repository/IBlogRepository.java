package vn.codegym.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.demo.model.Blog;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Long> {
    Page<Blog> findByCategoryId(Long aLong, Pageable pageable);
    Page<Blog> findByNameContaining(String s, Pageable pageable);
    void delete(Long id);
}
