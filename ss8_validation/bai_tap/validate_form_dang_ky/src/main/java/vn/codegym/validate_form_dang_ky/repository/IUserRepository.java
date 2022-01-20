package vn.codegym.validate_form_dang_ky.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.validate_form_dang_ky.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

}
