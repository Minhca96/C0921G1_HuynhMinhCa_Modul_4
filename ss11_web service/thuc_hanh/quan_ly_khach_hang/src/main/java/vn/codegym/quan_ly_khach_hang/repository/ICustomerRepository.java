package vn.codegym.quan_ly_khach_hang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.quan_ly_khach_hang.model.Customer;
@RequestMapping
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
