package educationCenter.storage;

import educationCenter.models.Lesson;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }


    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().contains(name)) {
                return lessons[i];
            }

        }
        return null;
    }

    public Lesson getByNameLesson(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().contains(name)) {
                return lessons[i];
            }

        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public void printNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i].getLessonName());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void searchByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().contains(lessonName)) {
                System.out.println(lessons[i]);
            }
        }
    }
}
