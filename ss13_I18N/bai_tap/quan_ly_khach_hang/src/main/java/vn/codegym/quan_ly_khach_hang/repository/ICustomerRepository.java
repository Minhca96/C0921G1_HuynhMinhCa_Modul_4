package vn.codegym.quan_ly_khach_hang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.quan_ly_khach_hang.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
