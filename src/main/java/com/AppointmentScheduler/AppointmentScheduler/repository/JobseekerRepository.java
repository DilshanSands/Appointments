package com.AppointmentScheduler.AppointmentScheduler.repository;
import com.AppointmentScheduler.AppointmentScheduler.entity.Jobseeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobseekerRepository extends JpaRepository<Jobseeker, Long> {
}