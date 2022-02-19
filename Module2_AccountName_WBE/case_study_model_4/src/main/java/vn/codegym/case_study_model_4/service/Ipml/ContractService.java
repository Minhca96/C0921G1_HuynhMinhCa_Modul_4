package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Contract> findAll() {
        return iContractRepository.findAll();
    }
}
