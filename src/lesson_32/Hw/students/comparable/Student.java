package students.comparable;

public class Student implements Comparable<Student> {

    protected int grade;
    protected String name;

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }


    @Override
    public int compareTo(Student o) {
        return this.grade - o.grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
