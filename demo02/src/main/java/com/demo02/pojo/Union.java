package com.demo02.pojo;

import java.time.LocalDateTime;

public class Union {
    private Integer actorId;
    private String firstName;
    private String lastName;
    private LocalDateTime lastUpdate;
    private Integer storeId;
    private Integer manageStaffId;
    private Integer addressId;

    public Union(Integer actorId, String firstName, String lastName, LocalDateTime lastUpdate, Integer storeId, Integer manageStaffId, Integer addressId) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
        this.storeId = storeId;
        this.manageStaffId = manageStaffId;
        this.addressId = addressId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getManageStaffId() {
        return manageStaffId;
    }

    public void setManageStaffId(Integer manageStaffId) {
        this.manageStaffId = manageStaffId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
