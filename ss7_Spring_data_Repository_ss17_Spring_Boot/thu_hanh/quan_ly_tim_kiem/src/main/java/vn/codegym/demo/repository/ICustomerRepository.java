package vn.codegym.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.codegym.demo.model.Customer;
import vn.codegym.demo.model.Province;

import java.awt.*;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findAllByFirstNameContaining(String s, Pageable pageable);
    void remove(Long id);
    Iterable<Customer> findAllByProvince(Province province);
}
