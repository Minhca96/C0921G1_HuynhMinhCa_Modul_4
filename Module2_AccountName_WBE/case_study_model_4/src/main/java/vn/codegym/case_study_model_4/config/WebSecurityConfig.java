package vn.codegym.case_study_model_4.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import vn.codegym.case_study_model_4.service.Ipml.MyUserDetailService;
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailService myUserDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return  new BCryptPasswordEncoder();
    }
    /*Cài đặt cách lấy thông tin UserDetail, cơ chế Encode pass..*/

    //cau hinh luu thong tin
    @Bean
    public PersistentTokenRepository persistentTokenRepository(){
        InMemoryTokenRepositoryImpl inMemoryTokenRepository = new InMemoryTokenRepositoryImpl();
        return inMemoryTokenRepository;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().formLogin()
//                .loginPage("/login")
                .defaultSuccessUrl("/furama").permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/furama").permitAll()
                .antMatchers("/service").hasAnyRole("user","admin")
                .antMatchers("/furama/**").hasRole("admin")
                .anyRequest().authenticated();


//        http.csrf().disable()
//                .formLogin()
//                .loginPage("/c09")
//                .defaultSuccessUrl("/student").permitAll() //Khi login bằng URL /login thì khi thành công sẽ vào '/student
//                .and()
//                .authorizeRequests()
//                .antMatchers("/home").permitAll() /*không cần xác thực.*/
//                .antMatchers("/student").hasAnyRole("USER","ADMIN")
//                .antMatchers("/student/create").hasRole("ADMIN")
//                    .antMatchers("/student/edit").hasRole("ADMIN")
//                    .antMatchers("/student/view").hasRole("ADMIN")
//                     .antMatchers("/student/**").hasRole("ADMIN")
//                .anyRequest().authenticated(); // Tất cả request gọi lên server đều phải login

        /*Cấu hình remember me*/
//        http.authorizeRequests().and().rememberMe()
//                .tokenRepository(this.persistentTokenRepository()).tokenValiditySeconds(60*60*24);
    }
}
