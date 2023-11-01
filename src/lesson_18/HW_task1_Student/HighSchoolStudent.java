package lesson_18.HW_task1_Student;

import lesson_18.HW_task1_Student.Student;

public class HighSchoolStudent extends Student {

    public HighSchoolStudent(String name, String age) {
        super(name, age);
    }

    public HighSchoolStudent() {

    }

    @Override
    public int averageGrade() {
        return super.averageGrade();
    }

    public void highSchoolStudent() {// назвать метод таким образом, чтобы понимать что он делает
        System.out.println("HighSchoolStudent");
    }
}
