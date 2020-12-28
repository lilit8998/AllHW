package educationCenter.models;


import java.util.Objects;

public class Lesson {

    private String lessonName;
    private int duration;
    private double price;
    private String lectureName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return duration == lesson.duration &&
                Double.compare(lesson.price, price) == 0 &&
                Objects.equals(lessonName, lesson.lessonName) &&
                Objects.equals(lectureName, lesson.lectureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessonName, duration, price, lectureName);
    }

    public Lesson(String lessonName, int duration, double price, String lectureName) {
        this.lessonName = lessonName;
        this.duration = duration;
        this.price = price;
        this.lectureName = lectureName;
    }

    public Lesson() {
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public String getLectureName() {
        return lectureName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", lectureName='" + lectureName + '\'' +
                '}';
    }
}
