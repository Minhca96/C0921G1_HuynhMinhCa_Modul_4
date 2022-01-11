package com.codegym.controller.service;

import com.codegym.controller.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    List<Customer> delete(int id);
}
