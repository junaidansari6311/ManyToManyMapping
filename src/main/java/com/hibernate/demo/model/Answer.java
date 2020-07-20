package com.hibernate.demo.model;

import java.util.List;

public class Answer {
    private int id;
    private String answerName;
    private String postedBy;
    private List<Question> questions;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAnswerName() {
        return answerName;
    }
    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }
    public String getPostedBy() {
        return postedBy;
    }
    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
    public List<Question> getQuestions() {
        return questions;
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
