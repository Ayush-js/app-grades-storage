package com.ltp.gradesubmission;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ltp.gradesubmission.Repository.GradeRepository;
import com.ltp.gradesubmission.Service.GradeService;
import com.ltp.gradesubmission.pojo.Grade;


@RunWith(MockitoJUnitRunner.class)
public class GradeServiceTest {

    @Mock
    private GradeRepository gradeRepository;
    
    @InjectMocks
    private GradeService gradeService;

    @Test
    public void getGradesFromRepoTest(){
       when(gradeRepository.getGrades()).thenReturn(Arrays.asList(
        new Grade("Harry", "Potion", "B+"),
        new Grade("Hermione", "Arithmancy", "A+")
       ));

       List<Grade> result = gradeService.getGrades();

       assertEquals("Harry", result.get(0).getName());
       assertEquals("Arithmancy", result.get(1).getSubject());

    }

    @Test 
    public void gradeIndexTest(){
      Grade grade = new Grade("Harry", "Potion", "B+");
         when(gradeRepository.getGrades()).thenReturn(Arrays.asList(grade));
         when(gradeRepository.getGrade(0)).thenReturn(grade);
       
       int valid = gradeService.getGradeIndex(grade.getId());
       int notFound = gradeService.getGradeIndex("123");

       assertEquals(0, valid);
       assertEquals(Constants.NOT_FOUND, notFound);

    }
}




//A mock can mimic the behavior of GradeRepository while having no logic of its own.