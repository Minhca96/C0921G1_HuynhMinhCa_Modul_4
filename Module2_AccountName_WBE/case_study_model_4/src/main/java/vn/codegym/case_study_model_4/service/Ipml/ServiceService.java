package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.repository.IServiceRepository;
import vn.codegym.case_study_model_4.service.IServiceService;

@Service
public class ServiceService implements IServiceService {
    @Autowired
   private IServiceRepository iServiceRepository;


    @Override
    public Page<vn.codegym.case_study_model_4.model.Service> findAll(String key_search, String rentTypeId, String serviceTypeId, Pageable pageable) {
        return iServiceRepository.searchService(key_search,rentTypeId,serviceTypeId,pageable);
    }

    @Override
    public void add(vn.codegym.case_study_model_4.model.Service service) {
        iServiceRepository.save(service);
    }
}
