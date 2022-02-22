package vn.codegym.case_study_model_4.service.Ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import vn.codegym.case_study_model_4.model.Employee;
import vn.codegym.case_study_model_4.repository.IEmployeeRepository;
import vn.codegym.case_study_model_4.service.IEmployeeService;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;


    @Override
    public Page<Employee> searchEmployee(String key_search, String divisionId, String positionId, String educationDegreeId, Pageable pageable) {
        return employeeRepository.findEmployee(key_search,divisionId,positionId,educationDegreeId,pageable);
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
