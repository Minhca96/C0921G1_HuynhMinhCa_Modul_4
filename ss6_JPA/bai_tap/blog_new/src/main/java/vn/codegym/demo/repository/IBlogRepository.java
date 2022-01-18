package vn.codegym.demo.repository;


import org.springframework.data.repository.CrudRepository;
import vn.codegym.demo.model.Blog;

public interface IBlogRepository extends CrudRepository<Blog,Integer> {
}
