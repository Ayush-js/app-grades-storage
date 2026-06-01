package com.ltp.gradesubmission;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ltp.gradesubmission.Controller.GradeController;

@SpringBootTest
class GradeSubmissionApplicationTests {

@Autowired
private GradeController controller;

	@Test
	void contextLoads() {
		assertNotNull(controller);
	}

}

//fhhae