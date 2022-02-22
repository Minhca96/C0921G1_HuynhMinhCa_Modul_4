package vn.codegym.case_study_model_4.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study_model_4.model.ContractDetail;


public interface IContractDetailService {


    Page<ContractDetail> findAll(String key_search, String contractId, String attachId, Pageable pageable);


    void add(ContractDetail contractDetail);
}
