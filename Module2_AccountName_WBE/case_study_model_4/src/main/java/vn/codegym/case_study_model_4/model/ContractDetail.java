package vn.codegym.case_study_model_4.model;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(targetEntity = Contract.class)
    private Contract contractId;
    @ManyToOne(targetEntity = AttachService.class)
    private AttachService attachServiceId;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int id) {
        this.id = id;
    }

    public ContractDetail(int id, Contract contractId, AttachService attachServiceId,
                          int quantity) {
        this.id = id;
        this.contractId = contractId;
        this.attachServiceId = attachServiceId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contract getContractId() {
        return contractId;
    }

    public void setContractId(Contract contractId) {
        this.contractId = contractId;
    }

    public AttachService getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(AttachService attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ContractDetail{" +
                "id=" + id +
                ", contractId=" + contractId +
                ", attachServiceId=" + attachServiceId +
                ", quantity=" + quantity +
                '}';
    }
}
