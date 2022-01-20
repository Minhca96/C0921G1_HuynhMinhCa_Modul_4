package vn.codegym.validate_form_dang_ky.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.validate_form_dang_ky.model.User;

public interface IUserService  {
    void save(User user);

    Page<User> findAll(Pageable pageable);
}
