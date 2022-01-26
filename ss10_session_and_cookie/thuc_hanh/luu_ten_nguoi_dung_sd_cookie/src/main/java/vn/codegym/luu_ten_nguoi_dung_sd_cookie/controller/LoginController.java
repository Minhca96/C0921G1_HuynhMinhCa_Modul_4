package vn.codegym.luu_ten_nguoi_dung_sd_cookie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.luu_ten_nguoi_dung_sd_cookie.model.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {
    //add user in model attribute
    @ModelAttribute("user")
    public User setUpUserFrom(){
        return new User();
    }

    @RequestMapping("/login")
    public String Index(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model){
        Cookie cookie = new Cookie("setUser", setUser);
        model.addAttribute("cookieValue",cookie);
        return "view";

    }

    @PostMapping("doLogin")
    public String doLogin(@ModelAttribute("user") User user, Model model, @CookieValue(value = "serUser", defaultValue = "")
                          String setUser , HttpServletResponse response, HttpServletRequest request){
        //implement business login
        if(user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("12345")){
            if(user.getEmail() !=null)
                setUser = user.getEmail();
            // create cookie and set it in reponse
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            // get all cookie
            Cookie[] cookies = request.getCookies();
            //iterate each cookie
            for(Cookie c: cookies){
              //  display only the cookie with the name 'setUser'
                if(c.getName().equals("setUser")){
                    model.addAttribute("cookieValue",c);
                    break;
                }else{
                    c.setValue("");
                    model.addAttribute("cookieValue",c);
                    break;
                }
            }
            model.addAttribute("message","Login secuss. Welcome");
        }else{
            user.setEmail("");
            Cookie cookie = new Cookie("setUser", setUser);
            model.addAttribute("cookieValue", cookie);
            model.addAttribute("message","Login failed.Try again.");
        }
return "/view";
    }
}
