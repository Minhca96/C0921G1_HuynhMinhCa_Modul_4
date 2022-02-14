package vn.codegym.ung_dung_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.ung_dung_blog.model.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
