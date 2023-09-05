package com.AppointmentScheduler.AppointmentScheduler.controller;


import com.AppointmentScheduler.AppointmentScheduler.entity.Jobseeker;
import com.AppointmentScheduler.AppointmentScheduler.repository.JobseekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
    public class JobseekerController {

        @Autowired
        private JobseekerRepository jobseekerRepository;

        @PostMapping("/jobseekers")
        public Jobseeker createJobseeker(@RequestBody Jobseeker jobseeker) {
            return jobseekerRepository.save(jobseeker);
        }

        @GetMapping("/jobseekers")
        public List<Jobseeker> getAllJobseekers() {
            return jobseekerRepository.findAll();
        }

        @GetMapping("/jobseekers/{id}")
        public Jobseeker getJobseekerById(@PathVariable Long id) {
            return jobseekerRepository.findById(id).orElse(null);
        }



    }

