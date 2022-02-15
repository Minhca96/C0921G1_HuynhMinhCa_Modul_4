package vn.codegym.quan_ly_khach_hang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.quan_ly_khach_hang.model.Customer;
import vn.codegym.quan_ly_khach_hang.repository.ICustomerRepository;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;


    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }
}
