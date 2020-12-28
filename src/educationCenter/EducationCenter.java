package educationCenter;

import educationCenter.models.Lesson;
import educationCenter.models.Student;
import educationCenter.storage.LessonStorage;
import educationCenter.storage.StudentStorage;

import java.util.Scanner;

public class EducationCenter implements Commands {

    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case SEARCH_STUDENT_BY_NAME:
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    studentStorage.searchByStudentNameOrSurname(name);
                    break;
                case SEARCH_LESSON_BY_NAME:
                    System.out.println("Please input name");
                    String lessonName = scanner.nextLine();
                    lessonStorage.searchByLessonName(lessonName);
                    break;
                case SEARCH_STUDENT_BY_LESSON_NAME:
                    searchStudentByLessonName();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();

                    break;
                case CHANGE_STUDENT_PHONE:
                    changeStudentPhonMail();
                    break;
                default:
                    System.out.println("Wrong command!!!");

            }
        }
    }

    private static void searchStudentByLessonName() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        Lesson byName = lessonStorage.getByName(lessonName);
        if (byName == null) {
            System.out.println("lesson does not exists");
        } else {
            studentStorage.searchByLesson(byName);
        }
    }

    private static void changeStudentPhonMail() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        Student student = studentStorage.getStudentByEmail(email);
        if (student != null) {
            System.out.println("Please input new phone");
            String phone = scanner.nextLine();
            student.setPhone(phone);
        } else {
            System.out.println("Student does not exists");
        }
    }

    private static void changeStudentLesson() {
        System.out.println("Please input your student's email");
        String email = scanner.nextLine();
        Student student = studentStorage.getStudentByEmail(email);
        if (student != null) {
            System.out.println("Please choose new lesson name");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = lessonStorage.getByName(lessonName);

            if (lesson != null) {
                student.setLesson(lesson);
                System.out.println("student lessin was chenged");

            } else {
                System.out.println("Lesson does not exists");

            }
        } else {
            System.out.println("Student does not exists");
        }
    }

    private static void addLesson() {
        System.out.println("Please input lessonName,duration,price,lectureName");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonData.length == 4) {
            String name = lessonData[0];
            Lesson byName = lessonStorage.getByName(name);
            if (byName == null) {
                int duration = Integer.parseInt(lessonData[1]);
                double price = Double.parseDouble(lessonData[2]);
                String lectureName = lessonData[3];
                Lesson lesson = new Lesson(name, duration, price, lectureName);
                lessonStorage.add(lesson);
                System.out.println("Lesson was added!");
            } else {
                System.out.println("Lesson with" + name + "already exists.Please choose another name");
                addLesson();
            }
        }
    }

    private static void addStudent() {
        if (lessonStorage.isEmpty()) {
            System.out.println("Please add lesson first");
            addLesson();
        } else {
            System.out.println("Please select lesson [name] from list");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = lessonStorage.getByName(lessonName);
            if (lesson == null) {
                System.out.println("Please select lessin from list");
                addStudent();
            } else {
                System.out.println("Please input name,surname,emil,phone");
                String studentDataStr = scanner.nextLine();
                String[] studentData = studentDataStr.split(",");
                Student student = new Student(studentData[0], studentData[1],
                        studentData[2], studentData[3], lesson);
                studentStorage.add(student);
                System.out.println("Student was added!");
            }
        }

    }

}
