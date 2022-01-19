package vn.codegym.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.demo.model.Customer;
import vn.codegym.demo.model.Province;

import java.util.Optional;

public interface ICustomerService {
    void save(Customer customer);

    Page<Customer> findAllByFirstNameContaining(String s, Pageable pageable);

    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(Long id);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
