package com.AppointmentScheduler.AppointmentScheduler.repository;

import com.AppointmentScheduler.AppointmentScheduler.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}