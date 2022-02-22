package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.AttachService;
import vn.codegym.case_study_model_4.repository.IAttachServiceRepository;
import vn.codegym.case_study_model_4.service.IAttachServiceService;

import java.util.List;

@Service
public class AttachServiceService implements IAttachServiceService {
    @Autowired
    private IAttachServiceRepository iAttachServiceRepository;

    @Override
    public List<AttachService> getAll() {
        return iAttachServiceRepository.findAll();
    }
}
