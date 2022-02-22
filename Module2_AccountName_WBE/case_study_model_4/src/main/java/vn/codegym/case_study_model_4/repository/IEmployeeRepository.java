package vn.codegym.case_study_model_4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study_model_4.model.Employee;
import vn.codegym.case_study_model_4.model.Service;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value = "SELECT * FROM  employee where name like concat('%',:employeeName,'%') " +
            "and division_id_id like concat('%',:divisionId,'%')" +
            "and education_degree_id_id like concat('%',:educationDegreeId,'%')" +
            "and position_id_id like concat('%',:positionId,'%')",nativeQuery = true)
    Page<Employee> findEmployee(@Param("employeeName") String serviceName,
                                @Param("divisionId") String divisionId,
                               @Param("positionId") String positionId,
                               @Param("educationDegreeId") String educationDegreeId,

                               Pageable pagle);
}
