package dev.elma.hospital_spring_mvc.repository;

import dev.elma.hospital_spring_mvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    Page<Patient> findPatientByNameContains(String name, Pageable pageable);
}
