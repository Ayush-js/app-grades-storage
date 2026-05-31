package com.ltp.gradesubmission.Repository;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ltp.gradesubmission.pojo.Grade;

@Repository //@component ke jagah hum @Repository use karte hai kyunki woh bhi bean hi banta hai.
public class GradeRepository {

     private List<Grade> studentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentGrades.get(index);
    }     

    public void addGrade(Grade grade) {
        studentGrades.add(grade);
    }
     public void updateGrade(int index, Grade grade) {
          studentGrades.set(index, grade);
     }
     public List<Grade> getGrades() {
          return studentGrades;
     }

}


//@Controller is also derived from @Component