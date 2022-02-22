package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.EducationDegree;
import vn.codegym.case_study_model_4.repository.IEducationDegreeRepository;
import vn.codegym.case_study_model_4.service.IEducationDegreeService;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository iEducationDegreeRepository;

    @Override
    public List<EducationDegree> getAll() {
        return iEducationDegreeRepository.findAll();
    }
}
