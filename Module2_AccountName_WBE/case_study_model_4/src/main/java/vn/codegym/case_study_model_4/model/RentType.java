package vn.codegym.case_study_model_4.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  double cost;
    @OneToMany(mappedBy = "rentTypeId")
    private List<Service> serviceList;

    public RentType() {
    }

    public RentType(int id) {
        this.id = id;
    }

    public RentType(int id, String name, double cost, List<Service> serviceList) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.serviceList = serviceList;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    @Override
    public String toString() {
        return "RentType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", serviceList=" + serviceList +
                '}';
    }
}
