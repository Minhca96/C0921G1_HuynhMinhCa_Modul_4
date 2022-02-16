package vn.codegym.ung_dung_blog_mo_rong.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_blog_mo_rong.model.MyUserDetail;
import vn.codegym.ung_dung_blog_mo_rong.model.User;
import vn.codegym.ung_dung_blog_mo_rong.repository.IUserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = iUserRepository.findByUserName(username);
        if(user==null){
            throw new UsernameNotFoundException("User name: " + username + " not found. ");
        }
        return new MyUserDetail(user);



    }
}
