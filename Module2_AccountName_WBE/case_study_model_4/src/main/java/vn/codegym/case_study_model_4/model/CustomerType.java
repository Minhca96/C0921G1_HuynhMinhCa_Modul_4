package vn.codegym.case_study_model_4.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "customerTypeId")
    private List<Customer> customerList;

    public CustomerType() {
    }

    public CustomerType(int id) {
        this.id = id;
    }

    public CustomerType(int id, String name, List<Customer> customerList) {
        this.id = id;
        this.name = name;
        this.customerList = customerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerList=" + customerList +
                '}';
    }
}
