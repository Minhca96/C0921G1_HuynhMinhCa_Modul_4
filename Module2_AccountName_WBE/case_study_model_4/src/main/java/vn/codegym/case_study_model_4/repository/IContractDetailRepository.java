package vn.codegym.case_study_model_4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study_model_4.model.ContractDetail;


@Repository
public interface IContractDetailRepository extends JpaRepository<ContractDetail,Long> {
    @Query(value="SELECT * FROM  contract_detail where id like concat('%',:contractDetailId,'%') " +
            "and contract_id_id like concat('%',:contractId,'%')"+
            "and attach_service_id_id like concat('%',:attachServiceId,'%')",
            nativeQuery=true)
    Page<ContractDetail> searchContractDetail(@Param("contractDetailId") String contractDetailId,
                                  @Param("contractId") String contractId,
                                  @Param("attachServiceId") String attachServiceId,
                                        Pageable pagle);
}
