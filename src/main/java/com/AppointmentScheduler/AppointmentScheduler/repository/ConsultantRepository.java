package com.AppointmentScheduler.AppointmentScheduler.repository;

import com.AppointmentScheduler.AppointmentScheduler.entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConsultantRepository extends JpaRepository<Consultant, Long> {

    Optional<Consultant> findByConsultantName(String consultantName);
    Optional<Consultant> findByEmail(String email);
    Optional<Consultant> findById(Long id);
}