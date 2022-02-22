package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.Position;
import vn.codegym.case_study_model_4.repository.IPositionRepository;
import vn.codegym.case_study_model_4.service.IPositionService;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository iPositionRepository;

    @Override
    public List<Position> getAll() {
        return iPositionRepository.findAll();
    }
}
