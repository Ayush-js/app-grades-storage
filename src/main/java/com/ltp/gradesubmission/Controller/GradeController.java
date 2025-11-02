package com.ltp.gradesubmission.Controller;

// import java.util.ArrayList;
// import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ltp.gradesubmission.Constants;
import com.ltp.gradesubmission.Repository.GradeRepository;
import com.ltp.gradesubmission.Service.GradeService;
import com.ltp.gradesubmission.pojo.Grade;

@Controller
public class GradeController {

    @Autowired
   GradeService gradeService;
//    GradeRepository gradeRepository = new GradeRepository();
    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        
        model.addAttribute("grade", gradeService.getGradeById(id)   );
        return "form";  
    }

    @PostMapping("/handleSubmit")
    public String submitForm( @Valid Grade grade, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        gradeService.submitToGrade(grade);
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", gradeService.getGrades());
        return "grades";
    }

   

}