package com.codegym.controller.repository;

import com.codegym.controller.model.Customer;

import java.util.List;

public interface ICustomerRepository {

    List<Customer> getAll();
     List<Customer> delete(int id);

}
