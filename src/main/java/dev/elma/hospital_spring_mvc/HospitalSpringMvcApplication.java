package dev.elma.hospital_spring_mvc;

import dev.elma.hospital_spring_mvc.entities.Patient;
import dev.elma.hospital_spring_mvc.repository.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class HospitalSpringMvcApplication implements CommandLineRunner {

    private PatientRepo patientRepo;
    public static void main(String[] args) {

        SpringApplication.run(HospitalSpringMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i <10 ; i++) {
            patientRepo.save(new Patient(null,"patient"+(i+1),new Date(),(int)(Math.random()*100),false));
        }
    }
}
