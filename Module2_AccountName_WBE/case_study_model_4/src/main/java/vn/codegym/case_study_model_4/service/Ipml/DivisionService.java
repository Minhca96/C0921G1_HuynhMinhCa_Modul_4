package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.Division;
import vn.codegym.case_study_model_4.repository.IDivisionRepository;
import vn.codegym.case_study_model_4.service.IDivisionService;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository iDivisionRepository;

    @Override
    public List<Division> getAll() {
        return iDivisionRepository.findAll();
    }
}
