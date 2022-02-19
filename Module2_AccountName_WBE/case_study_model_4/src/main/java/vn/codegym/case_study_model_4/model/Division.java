package vn.codegym.case_study_model_4.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "divisionId")
    private List<Employee> employeeList;

    public Division() {
    }

    public Division(Long id) {
        this.id = id;
    }

    public Division(Long id, String name, List<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.employeeList = employeeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
