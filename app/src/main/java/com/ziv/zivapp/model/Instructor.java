package com.ziv.zivapp.model;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {

    private ArrayList<String> managedCourseIds; // מזהי הקורסים שהמדריך מנהל

    public Instructor(String id, String firstName, String lastName, int age, String phone, String email, String password, ArrayList<String> managedCourseIds) {
        super(id, firstName, lastName, age, phone, email, password);
        this.managedCourseIds = managedCourseIds;
    }

    public List<String> getManagedCourseIds() { return managedCourseIds; }

    public void assignCourse(String courseId) {
        if (!managedCourseIds.contains(courseId)) {
            managedCourseIds.add(courseId);
        }
    }

    public void setManagedCourseIds(ArrayList<String> managedCourseIds) {
        this.managedCourseIds = managedCourseIds;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "managedCourseIds=" + managedCourseIds +
                '}';
    }
}
