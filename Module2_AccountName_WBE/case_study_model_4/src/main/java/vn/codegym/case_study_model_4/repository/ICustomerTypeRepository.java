package vn.codegym.case_study_model_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study_model_4.model.CustomerType;

@Repository
public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Long> {
}
