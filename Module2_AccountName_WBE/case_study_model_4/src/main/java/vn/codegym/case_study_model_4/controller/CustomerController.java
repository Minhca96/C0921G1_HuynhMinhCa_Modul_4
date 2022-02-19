package vn.codegym.case_study_model_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.case_study_model_4.model.Customer;
import vn.codegym.case_study_model_4.service.ICustomerService;
import vn.codegym.case_study_model_4.service.ICustomerTypeService;

import java.util.Optional;

@Controller
@RequestMapping("furama")

public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping(" ")
    public String getHome() {
        return "home";
    }

    @GetMapping("customer")
    public String getAllCustomer(Model model,
                                 @PageableDefault(value = 2) Pageable pageable,
                                 @RequestParam(defaultValue = "") String key_search,
                                 @RequestParam(defaultValue = "") String customerTypeId) {
        model.addAttribute("customerList", customerService.find(key_search, customerTypeId, pageable));
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "customer";
    }

    @GetMapping("addShow")
    public String showAdd(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "addCustomer";
    }

    @PostMapping("addCustomer")
    private String addCustomer(Model model, @ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.addCustomer(customer);
        redirectAttributes.addFlashAttribute("message", " add complete");
        return "redirect:/furama/customer";


    }

    @GetMapping("{id}/delete")
    public String getById(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        customerService.remote(id);
        redirectAttributes.addFlashAttribute("message", "delete complete");
        return "redirect:/furama/customer";
    }
}
