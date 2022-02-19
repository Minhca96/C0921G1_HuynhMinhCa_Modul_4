package vn.codegym.case_study_model_4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study_model_4.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
@Query(value="SELECT * FROM  customer where name like concat('%',:customerName,'%') " +
        "and customer_type_id_id like concat('%',:customerTypeId,'%')", nativeQuery=true)
Page<Customer> searchCustomer(@Param("customerName") String customerName,
                              @Param("customerTypeId") String customerTypeId,
                              Pageable pagle);

}
