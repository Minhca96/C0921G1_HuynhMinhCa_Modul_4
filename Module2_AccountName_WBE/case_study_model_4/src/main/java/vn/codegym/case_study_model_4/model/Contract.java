package vn.codegym.case_study_model_4.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date startDate;
    private Date endDate;
    private double deposit;
    private double totalMoney;
    @ManyToOne( targetEntity = Employee.class)
    private Employee employeeId;
    @ManyToOne(targetEntity = Customer.class)
    private Customer customerId;
    @ManyToOne(targetEntity = Service.class)
    private Service serviceId;
    @OneToMany(mappedBy = "contractId")
    private List<ContractDetail>   contractDetailList;

    public Contract() {
    }





}
