package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.repository.ICustomerRepositorry;

import java.util.List;
@Service
public class CustomerService implements ICustomerService{
    @Autowired
    ICustomerRepositorry iCustomerRepositorry;


    @Override
    public List<Customer> findAll() {
        return iCustomerRepositorry.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepositorry.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepositorry.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        iCustomerRepositorry.update(id,customer);
    }

    @Override
    public void remove(int id) {
        iCustomerRepositorry.remove(id);
    }
}
