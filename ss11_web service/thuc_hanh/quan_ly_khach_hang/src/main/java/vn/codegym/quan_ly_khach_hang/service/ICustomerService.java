package vn.codegym.quan_ly_khach_hang.service;

import vn.codegym.quan_ly_khach_hang.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> getAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);

    void remote(Long id);
}
