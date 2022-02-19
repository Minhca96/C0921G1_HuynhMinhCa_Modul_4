package vn.codegym.case_study_model_4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study_model_4.model.Service;


@Repository
public interface IServiceRepository extends JpaRepository<Service,Long> {
    @Query(value = "SELECT * FROM  service where name like concat('%',:serviceName,'%') " +
                "and service_type_id_id like concat('%',:serviceTypeId,'%')" +
            "and rent_type_id_id like concat('%',:rentTypeId,'%')", nativeQuery = true)
    Page<Service> searchService(@Param("serviceName") String serviceName,
                                @Param("rentTypeId") String rentTypeId,
                                @Param("serviceTypeId") String serviceTypeId,
                                Pageable pagle);

}
