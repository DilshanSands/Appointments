package com.AppointmentScheduler.AppointmentScheduler.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long appointmentId;
    @ManyToOne
    @JoinColumn(name = "consultant_id")
    private Consultant consultant;
    @ManyToOne
    @JoinColumn(name = "jobseeker_id")
    private Jobseeker jobseeker;
    private LocalDate appointmentDate;
    @jakarta.persistence.Id
    private Long id;

    public Appointment() {

    }


    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public Jobseeker getJobseeker() {
        return jobseeker;
    }

    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Appointment(Long appointmentId, Consultant consultant, Jobseeker jobseeker, LocalDate appointmentDate) {
        this.appointmentId = appointmentId;
        this.consultant = consultant;
        this.jobseeker = jobseeker;
        this.appointmentDate = appointmentDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
