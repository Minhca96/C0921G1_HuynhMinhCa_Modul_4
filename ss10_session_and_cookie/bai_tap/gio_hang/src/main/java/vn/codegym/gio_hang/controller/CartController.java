package vn.codegym.gio_hang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.gio_hang.model.Cart;

@Controller
public class CartController {
@ModelAttribute("cart")
    public Cart setupCart(){
    return  new Cart();
}
@GetMapping("getCart")
    public String showCart(Model model, @SessionAttribute("cart") Cart cart){
    model.addAttribute("cart",cart);
    return "yourCart";
}



}
