package com.ltp.gradesubmission.pojo;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.ltp.gradesubmission.validation.Score;

public class Grade {
    
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Subject cannot be blank")
    private String subject;
    @NotBlank(message = "Score cannot be empty")
    @Score(message = "Score must be in the letter grade format")
    private String score;
   
    private String id;
    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
