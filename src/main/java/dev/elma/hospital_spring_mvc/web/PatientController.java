package dev.elma.hospital_spring_mvc.web;

import dev.elma.hospital_spring_mvc.entities.Patient;
import dev.elma.hospital_spring_mvc.repository.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepo patientRepo;
    @GetMapping("/index")
    public String getAllPatients(){
        System.out.println("hello");
        //model.addAttribute("patientsList",patientRepo.findAll());
        return "patients";
    }

}
