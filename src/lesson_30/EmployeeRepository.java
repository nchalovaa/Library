package lesson_30;

/*Реализует интерфейс EmployeeRepositoryInterface.
Отвечает за хранение, добавление, удаление и поиск работников.
Содержит массив работников и методы для управления ими.*/

public class EmployeeRepository implements EmployeeRepositoryInterface {

    private final BaseEmployee[] EMPLOYEES = new BaseEmployee[10];
    static int counterId = 156789;

    @Override
    public boolean addEmployee(BaseEmployee employee) {
        if(employee == null){
            return false;
        }

        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] == null) {
                EMPLOYEES[i] = employee;
                EMPLOYEES[i].setId(++counterId);
                System.out.println("Сотрудник " + EMPLOYEES[i].name + " добавлен" + "\n");
                return true;
            }
        }
        System.out.println("В базе нет места" + "\n");
        return false;
    }

    @Override
    public boolean removeEmployee(int id) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getId() == id ) {
                System.out.println("Сотрудник c ID " + EMPLOYEES[i].getId() + " уволен" + "\n");
                EMPLOYEES[i] = null;
                return true;
            }
        }
        System.out.println("Сотрудник не найден" + "\n");
        return false;
    }

    @Override
    public BaseEmployee findEmployeeById(int id) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getId() == id) {
                System.out.println("Сотрудник c ID-" + id + " найден. \n");
                return EMPLOYEES[i];
            }
        }
        System.out.println("Сотрудник c ID-" + id + " не найден. \n");
        return null;
    }

    @Override
    public BaseEmployee[] getListAllEmployees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null) printAllList(i);
        }
        return EMPLOYEES;
    }

    public void printAllList(int index) {
        System.out.println("Имя сотрудника " + EMPLOYEES[index].name);
        System.out.println("ID сотрудника: " + EMPLOYEES[index].id);
        System.out.println("Год трудоустройства сотрудника: " + EMPLOYEES[index].hireYear);
        System.out.println("Ежемесячная плата сотруднику: " + EMPLOYEES[index].adjustSalaryByExperience() + "\n");
    }

    @Override
    public int getQuantityEmployees() {
        int counter = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null) {
                counter++;

            }
        }
        return counter;
    }


}
