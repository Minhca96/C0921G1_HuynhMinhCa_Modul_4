package com.codegym.controller.service;

import com.codegym.controller.model.Customer;
import com.codegym.controller.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
   private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> getAll() {
        return iCustomerRepository.getAll();
    }

    @Override
    public List<Customer> delete(int id) {
return iCustomerRepository.delete(id);
    }
}
