package com.ziv.zivapp.model;

import java.util.Arrays;

public class Question {
    private String questionText;
    private String[] options;     // 4 אפשרויות תשובה
    private int correctOptionIndex; // אינדקס התשובה הנכונה (0 עד 3)

    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() { return questionText; }
    public String[] getOptions() { return options; }
    public int getCorrectOptionIndex() { return correctOptionIndex; }

    // בדיקה האם התשובה שהזין החניך נכונה
    public boolean isCorrect(int selectedIndex) {
        return selectedIndex == correctOptionIndex;
    }

    public Question() {
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setCorrectOptionIndex(int correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }


    @Override
    public String toString() {
        return "Question{" +
                "questionText='" + questionText + '\'' +
                ", options=" + Arrays.toString(options) +
                ", correctOptionIndex=" + correctOptionIndex +
                '}';
    }
}
