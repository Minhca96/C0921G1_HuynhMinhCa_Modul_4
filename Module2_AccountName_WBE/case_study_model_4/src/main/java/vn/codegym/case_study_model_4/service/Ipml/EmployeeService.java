package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.repository.IEmployeeRepository;
import vn.codegym.case_study_model_4.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;
}
