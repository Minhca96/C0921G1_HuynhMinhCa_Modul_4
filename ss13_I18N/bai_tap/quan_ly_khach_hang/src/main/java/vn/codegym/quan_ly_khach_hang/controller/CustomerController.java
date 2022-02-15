package vn.codegym.quan_ly_khach_hang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.quan_ly_khach_hang.model.Customer;
import vn.codegym.quan_ly_khach_hang.repository.ICustomerRepository;
import vn.codegym.quan_ly_khach_hang.service.ICustomerService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("list")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping
    public ModelAndView getAll1(){
        return new ModelAndView("list");
    }
    @GetMapping("/display")
    public ResponseEntity<List<Customer>> getAll(){
       List<Customer> customerList = iCustomerService.findAll();
       if(customerList.isEmpty()){
           return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }else{
           return  new ResponseEntity<>(customerList,HttpStatus.OK);
       }
    }
}
