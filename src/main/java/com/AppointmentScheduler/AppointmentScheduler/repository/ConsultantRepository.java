package com.AppointmentScheduler.AppointmentScheduler.repository;

import com.AppointmentScheduler.AppointmentScheduler.entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantRepository<Consultant> extends JpaRepository<Consultant, Long> {
}