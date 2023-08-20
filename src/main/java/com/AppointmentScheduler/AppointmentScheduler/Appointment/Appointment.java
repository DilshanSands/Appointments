package com.AppointmentScheduler.AppointmentScheduler.Appointment;

import java.util.Date;

import com.AppointmentScheduler.AppointmentScheduler.Consultant.Consultant;
import com.AppointmentScheduler.AppointmentScheduler.JobSeeker.JobSeeker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "appointments")
public class Appointment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointment_id;
	
	 @ManyToOne
    @JoinColumn(name = "consultant_id")
    private Consultant consultant;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

    @Temporal(TemporalType.DATE)
    private Date appointmentDate;

    @Temporal(TemporalType.TIME)
    private Date appointmentTime;

    // Default constructor
    public Appointment() {
    }

	public Appointment(Consultant consultant, JobSeeker jobSeeker, Date appointmentDate, Date appointmentTime) {
		super();
		this.consultant = consultant;
		this.jobSeeker = jobSeeker;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
	}

	public Long getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(Long appointment_id) {
		this.appointment_id = appointment_id;
	}

	public Consultant getConsultant() {
		return consultant;
	}

	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Date getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
    
    

}
