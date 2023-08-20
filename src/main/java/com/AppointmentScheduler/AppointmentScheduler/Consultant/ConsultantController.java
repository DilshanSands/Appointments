package com.AppointmentScheduler.AppointmentScheduler.Consultant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ConsultantController {

//    private final ConsultantRepository consultantRepository;

    @Autowired private ConsultantService service;
    
    @GetMapping("/consultants")
    public String showConsultantList(Model model) {
    	List<Consultant> listConsultants = service.listAll();
    	model.addAttribute("listConsultants", listConsultants);
		return "consultants";
    	
    }
   
}
