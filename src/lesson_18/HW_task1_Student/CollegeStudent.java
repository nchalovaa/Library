package lesson_18.HW_task1_Student;

import lesson_18.HW_task1_Student.Student;

public class CollegeStudent extends Student {

    public CollegeStudent(String name, String age) {
        super(name, age);
    }

    public CollegeStudent() {
        super();
    }

    @Override
    public int averageGrade() {
        return super.averageGrade();
    }

    public void collegeStudent() {
        System.out.println("CollegeStudent");
    }
}