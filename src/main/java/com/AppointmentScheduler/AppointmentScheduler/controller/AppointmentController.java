package com.AppointmentScheduler.AppointmentScheduler.controller;

import com.AppointmentScheduler.AppointmentScheduler.entity.Appointment;
import com.AppointmentScheduler.AppointmentScheduler.entity.Jobseeker;
import com.AppointmentScheduler.AppointmentScheduler.repository.AppointmentRepository;
import com.AppointmentScheduler.AppointmentScheduler.repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class AppointmentController {

    @Autowired
    private ConsultantRepository consultantRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;
    private Long consultantId;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "appointment-form";
    }

    @PostMapping("/appointments")
    public String createAppointment(@ModelAttribute Appointment appointment) {
        appointmentRepository.save(appointment);
        return "redirect:/";
    }
}
