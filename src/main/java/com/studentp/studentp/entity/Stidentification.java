package com.studentp.studentp.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;


@Entity
@Table(name = "student_Records")
public class Stidentification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Stud_id")
    private Integer stid;
    @Column(name = "Stud_Fname")
    private String stFname;
    @Column(name = "Stud_Lname")
    private String stLname;
    @Column(name = "Stud_Address")
    private String stAddress;
    @Column(name = "Stud_Email")
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

    public String getStFname() {
        return this.stFname;
    }

    public String getStLname() {
        return this.stLname;
    }

    public String getStAddress() {
        return this.stAddress;
    }

    public String getStEmail() {
        return this.stEmail;
    }
    public Stidentification() {
    }
}
