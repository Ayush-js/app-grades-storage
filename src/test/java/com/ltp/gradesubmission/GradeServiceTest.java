package com.ltp.gradesubmission;

import static org.mockito.Mockito.when;

import java.util.Arrays;

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
        new Grade("Harry", "Potion", "B+")
       ));
    }
}




//A mock can mimic the behavior of GradeRepository while having no logic of its own.