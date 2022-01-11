package com.codegym.controller.repository;

import com.codegym.controller.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository implements ICustomerRepository{

    private static List<Customer> customerList;
    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"A","A@"));
        customerList.add(new Customer(2,"B","B@"));
        customerList.add(new Customer(3,"C","C@"));
        customerList.add(new Customer(4,"D","D@"));
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public List<Customer> delete(int id) {
        for (Customer c: customerList) {
            if(id == c.getId()){
                customerList.remove(c);
                break;
            }
        }
        return customerList;
    }
}
