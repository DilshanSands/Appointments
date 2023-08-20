package com.AppointmentScheduler.AppointmentScheduler.Consultant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultants")
public class Consultant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer consultant_id;

    private String firstName;
    private String lastName;
    private boolean isPartTime;
    @Column(unique = true)
    private String email;
    
    // Default constructor
    public Consultant() {
    }

	public Consultant(String firstName, String lastName, boolean isPartTime, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isPartTime = isPartTime;
		this.email = email;
	}

	public Integer getConsultant_id() {
		return consultant_id;
	}

	public void setConsultant_id(Integer consultant_id) {
		this.consultant_id = consultant_id;
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

	public boolean isPartTime() {
		return isPartTime;
	}

	public void setPartTime(boolean isPartTime) {
		this.isPartTime = isPartTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    
    

}
