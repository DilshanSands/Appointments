package com.AppointmentScheduler.AppointmentScheduler.repository;

import com.AppointmentScheduler.AppointmentScheduler.entity.Appointment;
import com.AppointmentScheduler.AppointmentScheduler.entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findAllByConsultantId(Long consultantId);

    List<Appointment> findAllByJobseekerId(Long jobseekerId);

    List<Appointment> findAllByAppointmentDate(LocalDate appointmentDate);
}