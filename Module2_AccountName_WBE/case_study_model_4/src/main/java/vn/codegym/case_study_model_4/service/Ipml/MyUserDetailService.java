package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.User;
import vn.codegym.case_study_model_4.repository.IUserRepository;
import vn.codegym.case_study_model_4.security.MyUserDetail;
@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public MyUserDetail loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = iUserRepository.findByUsername(username);
        if(user == null){
            throw  new UsernameNotFoundException("user name does not exist");
        }
        return new MyUserDetail(user);
    }
}
