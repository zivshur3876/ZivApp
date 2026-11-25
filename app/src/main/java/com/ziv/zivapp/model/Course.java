package com.ziv.zivapp.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseId;
    private String courseName;
    private List<Trainee> trainees;
    private List<LessonPlan> lessonPlans;
    private List<Quiz> quizzes;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainees = new ArrayList<>();
        this.lessonPlans = new ArrayList<>();
        this.quizzes = new ArrayList<>();
    }

    public Course() {
    }

    // הוספת אלמנטים לקורס
    public void addTrainee(Trainee trainee) { trainees.add(trainee); }
    public void addLessonPlan(LessonPlan plan) { lessonPlans.add(plan); }
    public void addQuiz(Quiz quiz) { quizzes.add(quiz); }

    // ממוצע ציונים כיתתי (תמונת מצב דינמית למדריך)
    public double getCourseAverageScore() {
        if (trainees.isEmpty()) return 0.0;
        double sum = 0;
        int count = 0;

        for (Trainee trainee : trainees) {
            for (TestResult result : trainee.getTestResults()) {
                sum += result.getScore();
                count++;
            }
        }
        return count == 0 ? 0.0 : sum / count;
    }

    // דוח חניכים שצריכים חיזוק (ציון ממוצע מתחת ל-70)
    public List<Trainee> getTraineesNeedingImprovement() {
        List<Trainee> strugglingTrainees = new ArrayList<>();
        for (Trainee trainee : trainees) {
            if (trainee.calculateAverageScore() < 70.0 && !trainee.getTestResults().isEmpty()) {
                strugglingTrainees.add(trainee);
            }
        }
        return strugglingTrainees;
    }

    // Getters
    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public List<Trainee> getTrainees() { return trainees; }
    public List<LessonPlan> getLessonPlans() { return lessonPlans; }
    public List<Quiz> getQuizzes() { return quizzes; }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public void setLessonPlans(List<LessonPlan> lessonPlans) {
        this.lessonPlans = lessonPlans;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", trainees=" + trainees +
                ", lessonPlans=" + lessonPlans +
                ", quizzes=" + quizzes +
                '}';
    }
}

