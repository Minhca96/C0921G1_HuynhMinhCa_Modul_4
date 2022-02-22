package vn.codegym.case_study_model_4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study_model_4.model.Contract;


@Repository
public interface IContractRepository extends JpaRepository<Contract,Long> {
    @Query(value = "SELECT * FROM  contract where id like concat('%',:contractId,'%') " +
            "and employee_id_id like concat('%',:employeeId,'%')" +
            "and customer_id_id like concat('%',:customerId,'%')" +
            "and service_id_id like concat('%',:serviceId,'%')",nativeQuery = true)
    Page<Contract> findContract(@Param("contractId") String contractId,
                                @Param("employeeId") String employeeId,
                                @Param("customerId") String customerId,
                                @Param("serviceId") String serviceId,
                                Pageable pagle);
}
