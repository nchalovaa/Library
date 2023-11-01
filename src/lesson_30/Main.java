package lesson_30;

public class Main {
    public static void main (String[]args) {

        EmployeeRepositoryInterface repositoryInterface = new EmployeeRepository();

        BaseEmployee employee1 = new Developer("Анастасия", 2020, 50, 140);
        BaseEmployee employee2 = new Manager("name2", 2012, 2500, 10);
        BaseEmployee employee3 = new Salesperson("name3", 2007, 2500, 15);

        BaseEmployee employee4 = new Developer("name4", 2023, 15, 300);
        BaseEmployee employee5 = new Manager("name5", 2011, 2500, 10);
        BaseEmployee employee6 = new Salesperson("name6", 2014, 2500, 15);

        BaseEmployee employee7 = new Developer("name7", 2021, 17, 300);
        BaseEmployee employee8 = new Manager("name8", 2018, 2500, 10);
        BaseEmployee employee9 = new Salesperson("name9", 2009, 2500, 15);

        BaseEmployee employee10 = new Developer("name10", 2021, 19, 300);
        BaseEmployee employee11 = new Manager("name11", 2018, 2500, 10);
        BaseEmployee employee12 = new Salesperson("name12", 2009, 2500, 15);

        repositoryInterface.addEmployee(employee1);
        repositoryInterface.addEmployee(employee2);
        repositoryInterface.addEmployee(employee3);
        repositoryInterface.addEmployee(employee4);
        repositoryInterface.addEmployee(employee5);
        repositoryInterface.addEmployee(employee6);
        repositoryInterface.addEmployee(employee7);
        repositoryInterface.addEmployee(employee8);
        repositoryInterface.addEmployee(employee9);
        repositoryInterface.addEmployee(employee10);
        repositoryInterface.addEmployee(employee11);
        repositoryInterface.addEmployee(employee12);


        repositoryInterface.getListAllEmployees();
        System.out.println(repositoryInterface.getQuantityEmployees());

        repositoryInterface.removeEmployee(156795);
        repositoryInterface.removeEmployee(156796);
        repositoryInterface.removeEmployee(1124577);

        repositoryInterface.getListAllEmployees();

        System.out.println(repositoryInterface.getQuantityEmployees());
    }
}
