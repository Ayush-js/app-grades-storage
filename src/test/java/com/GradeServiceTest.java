package com;

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



}


