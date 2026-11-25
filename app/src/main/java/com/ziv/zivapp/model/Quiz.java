package com.ziv.zivapp.model;

import java.util.ArrayList;

public class Quiz {
    private String quizId;
    private String title;
    private ArrayList<Question> questions;

    public Quiz(String quizId, String title, ArrayList<Question> questions) {
        this.quizId = quizId;
        this.title = title;
        this.questions = questions;
    }

    public String getQuizId() { return quizId; }
    public String getTitle() { return title; }
    public ArrayList<Question> getQuestions() { return questions; }

    /**
     * מנגנון בדיקה אוטומטי למבחן
     * @param userAnswers מערך של האינדקסים שנבחרו ע"י החניך
     * @return ציון מחושב מ-0 עד 100
     */
    public double evaluateQuiz(int[] userAnswers) {
        if (questions == null || questions.isEmpty() || userAnswers.length != questions.size()) {
            return 0.0;
        }

        int correctCount = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).isCorrect(userAnswers[i])) {
                correctCount++;
            }
        }

        return ((double) correctCount / questions.size()) * 100;
    }


    public Quiz() {
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "quizId='" + quizId + '\'' +
                ", title='" + title + '\'' +
                ", questions=" + questions +
                '}';
    }
}