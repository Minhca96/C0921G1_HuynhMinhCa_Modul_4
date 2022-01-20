package vn.codegym.validate_form_dang_ky.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.validate_form_dang_ky.model.User;
import vn.codegym.validate_form_dang_ky.repository.IUserRepository;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userService;

    @Override
    public void save(User user) {
        userService.save(user);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }
}
