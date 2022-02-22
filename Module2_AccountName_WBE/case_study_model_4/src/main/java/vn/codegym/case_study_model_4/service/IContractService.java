package vn.codegym.case_study_model_4.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study_model_4.model.Contract;
import vn.codegym.case_study_model_4.service.Ipml.ContractService;

import java.util.List;

public interface IContractService {

    Page<Contract> findAll(String key_search, String employee, String customer,String service, Pageable pageable);

    void add(Contract contract);

    List<Contract> getAll();
}
