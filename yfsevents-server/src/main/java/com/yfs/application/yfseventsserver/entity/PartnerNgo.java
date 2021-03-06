package com.yfs.application.yfseventsserver.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PartnerNgo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Name;
    private String description;
    private String branch;
    private String registrationNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String pincode;


    @OneToMany(mappedBy = "partnerNgo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AuthorizedPerson> authorizedPerson;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Set<AuthorizedPerson> getAuthorizedPerson() {
        return authorizedPerson;
    }

    public void setAuthorizedPerson(Set<AuthorizedPerson> authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }
}
