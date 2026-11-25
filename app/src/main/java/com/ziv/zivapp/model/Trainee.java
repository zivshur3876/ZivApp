package com.ziv.zivapp.model;

import java.util.ArrayList;
import java.util.List;

public class Trainee  extends User{


    private String courseId;
    private List<TestResult> testResults;


    public String getCourseId() { return courseId; }
    public List<TestResult> getTestResults() { return testResults; }

    public void addTestResult(TestResult result) {
        this.testResults.add(result);
    }

    public double calculateAverageScore() {
        if (testResults.isEmpty()) return 0.0;
        double total = 0;
        for (TestResult result : testResults) {
            total += result.getScore();
        }
        return total / testResults.size();
    }
}
