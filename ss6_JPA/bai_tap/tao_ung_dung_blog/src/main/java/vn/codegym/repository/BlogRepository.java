package vn.codegym.repository;


import org.springframework.stereotype.Repository;
import vn.codegym.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class BlogRepository implements IBlogRepository{
    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Blog> findAll() {
        return null;
    }

    @Override
    public Blog findById(int id) {
        return null;
    }

    @Override
    public void save(Blog blog) {
        if (blog.getId() != null) {
            em.merge(blog);
        } else {
            em.persist(blog);
        }
    }

    @Override
    public void remove(int id) {

    }
}
