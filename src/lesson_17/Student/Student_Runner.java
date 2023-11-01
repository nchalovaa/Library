package lesson_17.Student;




public class Student_Runner {
    public static void main(String[] args) {
        // объявил переменную студент с типом Student
        // Student student;

        // Bobkova Maryna
        Student studentMaryna = new Student(14, "Bobkova");
        Student studentNastja = new Student(2, "Anastasia", "Chalova");
        Student studentFarkhunda = new Student(9, "Farkhunda", "Odinaeva");
        Student studentVitalij = new Student("Vitalij", "Korniienko");
        Student studentMartins = new Student(8);
        Student studentDenys = new Student(6, "Denys", "Liubchenko");


        studentMaryna.setName("Maryna");
        System.out.println(studentMaryna.getId()); // 14
        System.out.println(studentMaryna.getName()); // Maryna
        System.out.println(studentMaryna.getLastName()); // Bobkova

        studentVitalij.setId(5);

        studentMartins.setName("Martins");
        studentMartins.setLastName("Groza");

        studentMaryna.setPresent(true);
        studentNastja.setPresent(true);
        studentFarkhunda.setPresent(true);
        studentVitalij.setPresent(true);
        studentMartins.setPresent(true);
        studentDenys.setPresent(false);

        System.out.println();

        Student[] students = new Student[6];
        students[0] = studentMaryna;
        students[1] = studentNastja;
        students[2] = studentFarkhunda;
        students[3] = studentVitalij;
        students[4] = studentMartins;
        students[5] = studentDenys;

        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            System.out.println("id: " + currentStudent.getId()
                    + " Name: " + currentStudent.getName()
                    + " LastName: " + currentStudent.getLastName()
                    + " is present: " + currentStudent.isPresent()
            );
        }
    }
}
