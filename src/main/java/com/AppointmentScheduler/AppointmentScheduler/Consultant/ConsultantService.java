package com.AppointmentScheduler.AppointmentScheduler.Consultant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultantService {
	@Autowired private ConsultantRepository repo;
	
	public List<Consultant> listAll() {
		return (List<Consultant>) repo.findAll();
		
	}
}
