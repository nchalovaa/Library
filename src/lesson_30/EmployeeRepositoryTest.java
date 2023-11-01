package lesson_30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeRepositoryTest {
    EmployeeRepositoryInterface repositoryInterface = new EmployeeRepository();

    @Test
    public void testAddEmployee_EmployeeAdded(){

        //Дано
        BaseEmployee employee1 = new Developer("Анастасия", 2020, 50, 140);
        BaseEmployee employee2 = new Manager("name2", 2012, 2500, 10);
        BaseEmployee employee3 = new Salesperson("name3", 2007, 2500, 15);
        BaseEmployee employee4 = new Developer("name4", 2023, 15, 300);
        BaseEmployee employee5 = new Manager("name5", 2011, 2500, 10);

        //Тогда
        Boolean  addEmployeeTrue = repositoryInterface.addEmployee(employee1); // Developer("Анастасия", 2020, 50, 140);
        Boolean  addEmployeeNull = repositoryInterface.addEmployee(null);

        //Когда
        Assertions.assertFalse(addEmployeeNull);
        Assertions.assertTrue(addEmployeeTrue);

    }

    @Test
    public void testRemoveEmployee_EmployeeRemoved(){
        //Дано
        BaseEmployee employee1 = new Developer("Анастасия", 2020, 50, 140);
        BaseEmployee employee2 = new Manager("name2", 2012, 2500, 10);
        BaseEmployee employee3 = new Salesperson("name3", 2007, 2500, 15);
        BaseEmployee employee4 = new Developer("name4", 2023, 15, 300);
        BaseEmployee employee5 = new Manager("name5", 2011, 2500, 10);

        //Тогда
      // Boolean removeEmployeeTrue = repositoryInterface.removeEmployee();

        //Когда
    }
}

