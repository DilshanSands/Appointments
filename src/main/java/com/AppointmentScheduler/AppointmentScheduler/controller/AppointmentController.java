package com.AppointmentScheduler.AppointmentScheduler.controller;

import com.AppointmentScheduler.AppointmentScheduler.entity.Appointment;
import com.AppointmentScheduler.AppointmentScheduler.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping
    public String listAppointments(Model model) {
        model.addAttribute("appointments", appointmentRepository.findAll());
        return "appointment-list";
    }

    @GetMapping("/")
    public String showAppointmentForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "index";
    }

    @PostMapping("/new")
    public String saveAppointment(
            @ModelAttribute Appointment appointment,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes
    ) {
        if (bindingResult.hasErrors()) {
            return "appointment-form";
        }

        appointmentRepository.save(appointment);
        redirectAttributes.addFlashAttribute("successMessage", "Appointment saved successfully");
        return "redirect:/appointments";
    }
}
