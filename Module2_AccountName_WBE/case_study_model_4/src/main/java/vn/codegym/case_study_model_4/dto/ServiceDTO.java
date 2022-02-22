package vn.codegym.case_study_model_4.dto;

import vn.codegym.case_study_model_4.model.RentType;
import vn.codegym.case_study_model_4.model.ServiceType;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ServiceDTO {
    private Long id;
    private String name;
    private int area;
    @NotNull
    @Pattern(message="total people must be greater than 0",regexp = "[1-9]\\d*$")
    private double cost;
    @NotNull
    @Pattern(message="total people must be greater than 0",regexp = "[1-9]\\d*$")
    private int maxPeople;
    private RentType rentTypeId;
    private ServiceType serviceTypeId;
    private String standRoom;
    private String descriptionOtherConveniance;
    @NotNull
    @Pattern(message="poolArea must be greater than 0",regexp = "[0-9]\\d*$")
    private double poolArea;
    @NotNull
    @Pattern(message="floor number must be a positive integer",regexp = "[0-9]\\d*$")
    private int numberOfFloors;

    public ServiceDTO() {
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public ServiceType getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(ServiceType serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getStandRoom() {
        return standRoom;
    }

    public void setStandRoom(String standRoom) {
        this.standRoom = standRoom;
    }

    public String getDescriptionOtherConveniance() {
        return descriptionOtherConveniance;
    }

    public void setDescriptionOtherConveniance(String descriptionOtherConveniance) {
        this.descriptionOtherConveniance = descriptionOtherConveniance;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
