package students.comparable;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student(6, "name1"),
                new Student(7, "name2"),
                new Student(6, "name3"),
                new Student(7, "name4"),
                new Student(8, "name5"),
                new Student(10, "name6"),
                new Student(10, "name7"),
                new Student(9, "name8"),
                new Student(6, "name9"),
                new Student(7, "name10"),
                new Student(2, "name11"),
                new Student(6, "name12"),
                new Student(7, "name13"),
                new Student(8, "name14"),
                new Student(5, "name15"),
                new Student(6, "name16"),
                new Student(7, "name17"),
        };
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        System.out.println();
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }


    }
}
