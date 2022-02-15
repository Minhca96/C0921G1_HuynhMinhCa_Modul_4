package vn.codegym.ung_dung_blog_mo_rong_ajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.ung_dung_blog_mo_rong_ajax.model.Category;


@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
