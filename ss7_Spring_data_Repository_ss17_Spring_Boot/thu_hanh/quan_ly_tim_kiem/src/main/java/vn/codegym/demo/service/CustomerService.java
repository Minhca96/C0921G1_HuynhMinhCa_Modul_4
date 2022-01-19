package vn.codegym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.demo.model.Customer;
import vn.codegym.demo.model.Province;
import vn.codegym.demo.repository.ICustomerRepository;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String s, Pageable pageable) {
        return iCustomerRepository.findAllByFirstNameContaining(s,pageable);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.remove(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return iCustomerRepository.findAllByProvince(province);
    }
}
