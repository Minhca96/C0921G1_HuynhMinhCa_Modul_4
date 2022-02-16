package vn.codegym.ung_dung_blog_mo_rong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.ung_dung_blog_mo_rong.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
