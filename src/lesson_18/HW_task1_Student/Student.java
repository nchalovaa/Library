package lesson_18.HW_task1_Student;
import java.util.Scanner;

/*Создайте базовый класс Student (Студент) с атрибутами имя, возраст и средний балл.
Затем создайте два подкласса: HighSchoolStudent (Старшеклассник) и CollegeStudent (Студент колледжа).

Добавьте методы в базовый класс для вычисления статуса студента на основе среднего балла.
Например, если средний балл больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.

Создайте несколько объектов разных классов студентов и вызовите методы для определения их статуса.*/

public class Student {


        private String name;
        private String age;
        private int[] grades; // объявление массива


        public Student(String name, String age) {
                this.name = name;
                this.age = age;
        }

        public Student() {

        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAge() {
                return age;
        }

        public void setAge(String age) {
                this.age = age;
        }

        public int[] getGrades() {
                return grades;
        }

        public void setGrades(int[] grades) {
                this.grades = grades;
        }


        //
        public int averageGrade(){ //метод, который будет высчитывать среднюю оценку

                int sum = 0;
                for (int i = 0; i < grades.length; i++) { //перебираем массив
                        sum += grades[i]; // делаем сумму всех чисел в массиве
                }
            return sum / grades.length;
        }



}
