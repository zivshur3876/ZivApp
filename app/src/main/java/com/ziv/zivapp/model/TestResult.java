package com.ziv.zivapp.model;

import java.util.Date;

public class TestResult {


        private String quizId;
        private double score;
        private Date dateTaken;

    public TestResult(String quizId, double score) {
        this.quizId = quizId;
        this.score = score;
        this.dateTaken = new Date(); // תאריך נכון לרגע הביצוע
    }

        public String getQuizId() { return quizId; }
        public double getScore() { return score; }
        public Date getDateTaken() { return dateTaken; }

    public TestResult() {
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }


    @Override
    public String toString() {
        return "TestResult{" +
                "quizId='" + quizId + '\'' +
                ", score=" + score +
                ", dateTaken=" + dateTaken +
                '}';
    }
}
