package vn.codegym.case_study_model_4.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study_model_4.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
//    Page<Customer> findAll(Pageable pageable);

    void remote(Long id);

    void addCustomer(Customer customer);

    Page<Customer> find( String name, String typeId, Pageable pagle);

    List<Customer> getAll();

    Customer findId(Long id);

    void edit(Customer customer);
}

