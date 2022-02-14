package vn.codegym.quan_ly_khach_hang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.codegym.quan_ly_khach_hang.model.Customer;
import vn.codegym.quan_ly_khach_hang.repository.ICustomerRepository;
import vn.codegym.quan_ly_khach_hang.service.ICustomerService;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    // xem ds
    @GetMapping
    public ResponseEntity<Iterable<Customer>> findAllCustomer(){
        List<Customer> customerList = (List<Customer>) iCustomerService.getAll();
        if(customerList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(customerList,HttpStatus.OK);
        }
    }
    // get theo id
    @GetMapping("/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable Long id){
        Optional<Customer> customer = iCustomerService.findById(id);
        if(!customer.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return  new ResponseEntity<>(customer.get(), HttpStatus.OK);
        }

    }
    // add
    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(iCustomerService.save(customer),HttpStatus.CREATED);
    }
    // update
    @PutMapping("{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,@RequestBody Customer customer){
        Optional<Customer> customer1 = iCustomerService.findById(id);
        if(!customer1.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            customer.setId(customer1.get().getId());
            return new ResponseEntity<>(iCustomerService.save(customer),HttpStatus.OK);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Customer> delete(@PathVariable Long id){
        Optional<Customer> customer = iCustomerService.findById(id);
        if(!customer.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            iCustomerService.remote(id);
            return new ResponseEntity<>(customer.get(),HttpStatus.OK);
        }
    }

}
