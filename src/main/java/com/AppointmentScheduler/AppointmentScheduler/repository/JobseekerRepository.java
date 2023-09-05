package com.AppointmentScheduler.AppointmentScheduler.repository;

import com.AppointmentScheduler.AppointmentScheduler.entity.Jobseeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

    public interface JobseekerRepository extends JpaRepository<Jobseeker, Long> {

        Optional<Jobseeker> findByEmail(String email);

        Optional<Jobseeker> findByName(String name);

        Optional<Jobseeker> findById(Long id);
    }
