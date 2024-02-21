package com.example.realestate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rent {
    @Id
    private int propertyId;
    private String propertyType;
    private String propertyPlace;
    private int BHK;
    private double rentAmount;
    private double depositAmount;
    private String ownerName;
    private String ownerNumber;
    
    public Rent() {
    }

    public Rent(int propertyId, String propertyType, String propertyPlace, int BHK, double rentAmount,
            double depositAmount, String ownerName, String ownerNumber) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.propertyPlace = propertyPlace;
        this.BHK = BHK;
        this.rentAmount = rentAmount;
        this.depositAmount = depositAmount;
        this.ownerName = ownerName;
        this.ownerNumber = ownerNumber;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyPlace() {
        return propertyPlace;
    }

    public void setPropertyPlace(String propertyPlace) {
        this.propertyPlace = propertyPlace;
    }

    public int getBHK() {
        return BHK;
    }

    public void setBHK(int BHK) {
        this.BHK = BHK;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }
    
   
}
