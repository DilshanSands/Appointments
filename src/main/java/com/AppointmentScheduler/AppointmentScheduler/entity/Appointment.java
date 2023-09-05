package com.AppointmentScheduler.AppointmentScheduler.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@Entity
@Table(name = "appointment")
public class Appointment {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long consultantId;
    private Long jobseekerId;
    private LocalDate appointmentDate;

    public Appointment() {
    }

    public Appointment(Long consultantId, Long jobseekerId, LocalDate appointmentDate) {
        this.consultantId = consultantId;
        this.jobseekerId = jobseekerId;
        this.appointmentDate = appointmentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public Long getJobseekerId() {
        return jobseekerId;
    }

    public void setJobseekerId(Long jobseekerId) {
        this.jobseekerId = jobseekerId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }


}
