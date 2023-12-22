package com.empmgmt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
 
    @Column(name = "email")    
    private String email;

    private String dob;
    private String gender;
    private String education;
    private String company;
    private Long experience;
    private Long pkg;

    public Employee() {
    }


    public Employee(long id, String firstName, String lastName, String email, String dob, String gender,
            String education, String company, Long experience, Long pkg) {
                super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.education = education;
        this.company = company;
        this.experience = experience;
        this.pkg = pkg;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getDob() {
        return dob;
    }


    public void setDob(String dob) {
        this.dob = dob;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getEducation() {
        return education;
    }


    public void setEducation(String education) {
        this.education = education;
    }


    public String getCompany() {
        return company;
    }


    public void setCompany(String company) {
        this.company = company;
    }


    public Long getExperience() {
        return experience;
    }


    public void setExperience(Long experience) {
        this.experience = experience;
    }


    public Long getPkg() {
        return pkg;
    }


    public void setPkg(Long pkg) {
        this.pkg = pkg;
    }

    
    

}
