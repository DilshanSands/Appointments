package com.AppointmentScheduler.AppointmentScheduler.controller;

import com.AppointmentScheduler.AppointmentScheduler.entity.Consultant;
import com.AppointmentScheduler.AppointmentScheduler.repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Controller
public class ConsultantController {
    @Autowired
    private ConsultantRepository consultantRepository;

    @PostMapping("/consultants")
    public Consultant createConsultant(@RequestBody Consultant consultant) {
        return consultantRepository.save(consultant);
    }

    @GetMapping("/consultants")
    public List<Consultant> getAllConsultants() {
        return consultantRepository.findAll();
    }

    @GetMapping("/consultants/{id}")
    public Consultant getConsultantById(@PathVariable Long id) {
        return consultantRepository.findById(id).orElse(null);
    }
}
