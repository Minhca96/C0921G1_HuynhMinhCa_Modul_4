package vn.codegym.spring_security_nhap.service.Iplm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.spring_security_nhap.repository.IUserRepository;
import vn.codegym.spring_security_nhap.service.IUserService;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;
}
