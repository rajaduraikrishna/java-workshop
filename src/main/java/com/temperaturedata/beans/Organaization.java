package com.temperaturedata.beans;

import java.io.Serializable;
import java.time.LocalDate;

public class Organaization implements Serializable {
    private String name;
    private String type;
    private String certificateId;
    private LocalDate dateOfInitiation;
    private String email;
    private String contactNumber;
    private String ceo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public LocalDate getDateOfInitiation() {
        return dateOfInitiation;
    }

    public void setDateOfInitiation(LocalDate dateOfInitiation) {
        this.dateOfInitiation = dateOfInitiation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String toString() {
        return this.name + " " +
                this.contactNumber;
    }
}
