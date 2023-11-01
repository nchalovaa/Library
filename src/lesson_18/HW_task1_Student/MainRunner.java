package lesson_18.HW_task1_Student;
import lesson_18.HW_task1_Student.Student;
import lesson_18.HW_task1_Student.CollegeStudent;
import lesson_18.HW_task1_Student.HighSchoolStudent;
import java.util.Scanner;


public class MainRunner {

    public static void main(String[] args) {

        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        CollegeStudent collegeStudent = new CollegeStudent();


        highSchoolStudent.setName("Anastasiia");
        highSchoolStudent.setAge("15");
        int[] grades = new int[]{2, 4, 3, 5, 5}; // создание массива с оценками от 1 до 5 на основе которых будет вычисляться его средний балл
        highSchoolStudent.setGrades(grades);
        int averageGrade = highSchoolStudent.averageGrade();

        collegeStudent.setName("Mira");
        collegeStudent.setAge("20");
        int[] grades2 = new int[]{5, 5, 4, 3, 5, 5}; // создание массива с оценками от 1 до 5 на основе которых будет вычисляться его средний балл
        collegeStudent.setGrades(grades2);
        int averageGrade2 = collegeStudent.averageGrade();

// Например, если средний балл больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.
        if (averageGrade >= 4) {
            System.out.println("Отличник");
        } else if (averageGrade < 4) {
            System.out.println("Хорошист");
        }

        if (averageGrade2 >= 4) {
            System.out.println("Отличник");
        } else if (averageGrade2 < 4) {
            System.out.println("Хорошист");
        }
    }
}
