package lesson_30;

/*Определяет методы, которые должны быть реализованы в классе EmployeeRepository для управления данными о работниках.
Включает методы для добавления, удаления, поиска, получения списка всех работников и получения количества работников.*/

public interface EmployeeRepositoryInterface {

        boolean addEmployee(BaseEmployee employee);

        boolean removeEmployee(int id);

        BaseEmployee findEmployeeById(int id);

        BaseEmployee[] getListAllEmployees();

        int getQuantityEmployees ();

    }

