package com.ltp.gradesubmission.validation;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator<Score, String> {

    List<String> Scores = List.of("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F");

   @Override
   public boolean isValid(String value, ConstraintValidatorContext context) {
        
         if (value == null || value.isBlank()) {
            return true;
        }

         for (String string : Scores) {
              if (value.equals(string)) {
                return true;
              }
         }
       return false; 
   }
    
}
