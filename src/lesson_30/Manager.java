package lesson_30;

/* Подкласс BaseEmployee, представляющий менеджера.
Содержит специфические поля, такие как baseSalary и numberOfProjects, и реализует метод calculateSalary().
Расчет зарплаты для менеджеров: базовая зарплата + бонус за количество проектов.*/

public class Manager extends BaseEmployee {
    int baseSalary;
    int numberOfProjects;

    final int PRICE_FOR_PROJECT = 50;

    public Manager(String name,int hireYear, int baseSalary, int numberOfProjects) {
        super(name, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+(PRICE_FOR_PROJECT*numberOfProjects);
    }

}
