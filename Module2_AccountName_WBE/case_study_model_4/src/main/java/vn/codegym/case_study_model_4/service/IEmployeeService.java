package vn.codegym.case_study_model_4.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study_model_4.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> searchEmployee(String key_search, String divisionId,String positionId, String educationDegreeId, Pageable pageable);

    void add(Employee employee);

    List<Employee> getAll();
}
