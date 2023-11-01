package lesson_30;

/* Подкласс BaseEmployee, представляющий продажника.
Содержит специфические поля, такие как baseSalary и numberOfDeals, и реализует метод calculateSalary().
Расчет зарплаты для продажников: базовая зарплата + бонус за количество сделок.*/

public class Salesperson extends BaseEmployee {
    int baseSalary;
    int numberOfDeals;
    final int DEAL = 70;

    public Salesperson(String name,  int hireYear, int baseSalary, int numberOfDeals) {
        super(name, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfDeals = numberOfDeals;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+(numberOfDeals*DEAL);
    }
}
