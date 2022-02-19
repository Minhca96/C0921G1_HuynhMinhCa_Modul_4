package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.ServiceType;
import vn.codegym.case_study_model_4.repository.IServiceRepository;
import vn.codegym.case_study_model_4.repository.IServiceTypeRepository;
import vn.codegym.case_study_model_4.service.IServiceTypeService;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository iServiceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return iServiceTypeRepository.findAll();
    }
}
