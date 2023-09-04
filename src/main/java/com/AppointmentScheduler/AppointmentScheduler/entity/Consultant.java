package com.AppointmentScheduler.AppointmentScheduler.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Consultant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consultant_id")
    private Long consultantId;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, name = "consultant_name")
    private String consultantName;
    @jakarta.persistence.Id
    private Long id;

    public Consultant(Long consultantId, String email, String consultantName, Long id) {
        this.consultantId = consultantId;
        this.email = email;
        this.consultantName = consultantName;
        this.id = id;
    }

    public Consultant() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

}

