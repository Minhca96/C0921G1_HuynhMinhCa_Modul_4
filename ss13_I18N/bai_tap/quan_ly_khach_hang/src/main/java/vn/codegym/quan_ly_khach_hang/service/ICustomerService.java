package vn.codegym.quan_ly_khach_hang.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.quan_ly_khach_hang.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();
}
