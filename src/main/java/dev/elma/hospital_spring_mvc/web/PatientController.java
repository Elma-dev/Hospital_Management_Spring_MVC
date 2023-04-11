package dev.elma.hospital_spring_mvc.web;

import dev.elma.hospital_spring_mvc.repository.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepo patientRepo;
    @GetMapping("/index")
    public String getAllPatients(Model model){
        model.addAttribute("patientsList",patientRepo.findAll());
        return "patients";
    }

}
