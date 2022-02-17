package vn.codegym.case_study_model_4.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String password;
    @OneToOne(mappedBy = "userName")
    private Employee employee;
    @OneToMany(mappedBy = "roleId")
    private List<UserRole> userRoleList;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String password, Employee employee, List<UserRole> userRoleList) {
        this.name = name;
        this.password = password;
        this.employee = employee;
        this.userRoleList = userRoleList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", employee=" + employee +
                ", userRoleList=" + userRoleList +
                '}';
    }
}
