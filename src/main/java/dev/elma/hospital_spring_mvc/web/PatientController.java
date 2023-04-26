package dev.elma.hospital_spring_mvc.web;

import dev.elma.hospital_spring_mvc.entities.Patient;
import dev.elma.hospital_spring_mvc.repository.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepo patientRepo;
    @GetMapping("/index")
    public String getAllPatients(Model model, @RequestParam(name = "p",defaultValue ="0") int page,@RequestParam(name = "s",defaultValue = "4") int size,@RequestParam(name = "keyWord",defaultValue = "") String keyWord){
        Page<Patient> patientPage=patientRepo.findPatientByNameContains(keyWord,PageRequest.of(page,size));
        model.addAttribute("patientsList",patientPage.getContent());
        model.addAttribute("pages",new int[patientPage.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyWord",keyWord);
        return "patients";
    }

}
