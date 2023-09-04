package com.AppointmentScheduler.AppointmentScheduler.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Jobseeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobseeker_id")
    @jakarta.persistence.Id
    private Long jobseekerId;
    @Column(name = "jobseeker_name")
    private String jobseekerName;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;

    public Jobseeker() {

    }
    public Long getJobseekerId() {
        return jobseekerId;
    }

    public void setJobseekerId(Long jobseekerId) {
        this.jobseekerId = jobseekerId;
    }

    public String getJobseekerName() {
        return jobseekerName;
    }

    public void setJobseekerName(String jobseekerName) {
        this.jobseekerName = jobseekerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Jobseeker(Long jobseekerId, String jobseekerName, String phoneNumber, String email) {
        this.jobseekerId = jobseekerId;
        this.jobseekerName = jobseekerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

}