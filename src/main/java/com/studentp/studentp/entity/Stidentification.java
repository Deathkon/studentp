package com.studentp.studentp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;


@Entity
// @Table(name = "Student_TBL")
public class Stidentification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer stid;
    @Column(nullable = false)
    private String stFname;
    @Column(nullable = false)
    private String stLname;
    @Column(nullable = false)
    private String stAddress;
    @Column(nullable = false)
    private String stEmail;

    public Stidentification(Integer stid, String stFname, String stLname, String stAddress, String stEmail) {
        this.stid = stid;
        this.stFname = stFname;
        this.stLname = stLname;
        this.stAddress = stAddress;
        this.stEmail = stEmail;
    }

    public Integer getStid() {
        return this.stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStFname() {
        return this.stFname;
    }

    public void setStFname(String stFname) {
        this.stFname = stFname;
    }

    public String getStLname() {
        return this.stLname;
    }

    public void setStLname(String stLname) {
        this.stLname = stLname;
    }

    public String getStAddress() {
        return this.stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public String getStEmail() {
        return this.stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }


    public Stidentification() {
    }
}
