package vn.codegym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.demo.model.Category;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
