package vn.codegym.quan_ly_khach_hang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.quan_ly_khach_hang.model.Customer;
import vn.codegym.quan_ly_khach_hang.repository.ICustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Iterable<Customer> getAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
      return   iCustomerRepository.save(customer);
    }

    @Override
    public void remote(Long id) {
        iCustomerRepository.deleteById(id);
    }
}
