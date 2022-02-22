package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.Contract;
import vn.codegym.case_study_model_4.repository.IContractRepository;
import vn.codegym.case_study_model_4.service.IContractService;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;


    @Override
    public Page<Contract> findAll(String key_search, String employee, String customer,String service, Pageable pageable) {
        return iContractRepository.findContract(key_search,employee,customer,service,pageable);
    }

    @Override
    public void add(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public List<Contract> getAll() {
        return iContractRepository.findAll();
    }
}
