package com.ziv.zivapp.model;

public class LessonPlan {

    private String lessonId;
    private String title;         // למשל: "החייאת מכשירים ודפיברילטור"
    private String topic;         // נושא מרכזי
    private String content;       // תוכן מערך השיעור/קובץ מצורף
    private int estimatedMinutes; // משך זמן מתוכנן בדקות

    public LessonPlan(String lessonId, String title, String topic, String content, int estimatedMinutes) {
        this.lessonId = lessonId;
        this.title = title;
        this.topic = topic;
        this.content = content;
        this.estimatedMinutes = estimatedMinutes;
    }

    public LessonPlan() {
    }

    public String getLessonId() { return lessonId; }
    public String getTitle() { return title; }
    public String getTopic() { return topic; }
    public String getContent() { return content; }
    public int getEstimatedMinutes() { return estimatedMinutes; }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setEstimatedMinutes(int estimatedMinutes) {
        this.estimatedMinutes = estimatedMinutes;
    }

    @Override
    public String toString() {
        return "LessonPlan{" +
                "lessonId='" + lessonId + '\'' +
                ", title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                ", content='" + content + '\'' +
                ", estimatedMinutes=" + estimatedMinutes +
                '}';
    }
}
