package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.repository.IUserRepository;
import vn.codegym.case_study_model_4.service.IUserService;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;
}
