package lesson_30;

/* Developer (Класс):

Подкласс BaseEmployee, представляющий разработчика.
Содержит специфические поля, такие как hourlyRate и hoursWorked, и реализует метод calculateSalary().
Расчет зарплаты для разработчиков: почасовая ставка * количество отработанных часов.*/

public class Developer extends BaseEmployee {
    int hourlyRate;
    int hoursWorked;

    public Developer(String name,  int hireYear, int hourlyRate, int hoursWorked)
    {
        super(name,  hireYear);
        this.hourlyRate =hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked*hourlyRate;
    }
}
