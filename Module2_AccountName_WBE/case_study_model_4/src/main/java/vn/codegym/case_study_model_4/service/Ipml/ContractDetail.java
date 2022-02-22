package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.repository.IContractDetailRepository;
import vn.codegym.case_study_model_4.service.IContractDetailService;

@Service
public class ContractDetail implements IContractDetailService {
    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Override
    public Page<vn.codegym.case_study_model_4.model.ContractDetail> findAll(String key_search, String contractId, String attachId, Pageable pageable) {
        return iContractDetailRepository.searchContractDetail(key_search,contractId,attachId,pageable);
    }

    @Override
    public void add(vn.codegym.case_study_model_4.model.ContractDetail contractDetail) {
        iContractDetailRepository.save(contractDetail);
    }


}
