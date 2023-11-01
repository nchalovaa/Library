package lesson_30;

/*BaseEmployee (Абстрактный класс):

Реализует интерфейс Employee и предоставляет общую функциональность для всех работников.
Содержит общие поля и методы, такие как name, id, hireYear, salary, adjustSalaryByExperience().
Метод calculateSalary() оставлен для реализации в подклассах.

Расчет зарплаты

Для каждой специализации работников (разработчики, менеджеры и продажники) должен быть реализован расчет зарплаты в соответствии с
их характеристиками.
Расчет зарплаты для разработчиков: почасовая ставка * количество отработанных часов.
Расчет зарплаты для менеджеров: базовая зарплата + бонус за количество проектов.
Расчет зарплаты для продажников: базовая зарплата + бонус за количество сделок.

Повышение зарплаты по стажу

Пользователь должен иметь возможность повысить зарплату для работников с опытом от X до Y лет на Z%.
Опыт работы вычисляется как разница текущего года и года найма.*/


import lesson_17.hw_Cube.Cube;

public abstract class BaseEmployee implements Employee {
    protected String name;
    protected Integer id;
    protected int hireYear;
    final int CURRENT_YEAR = 2023;


public double adjustSalaryByExperience() {
    if ((CURRENT_YEAR - hireYear) < 5) {
        return calculateSalary();
    } else if ((CURRENT_YEAR-hireYear) < 10) {
        return calculateSalary()* 1.2;
    } else if ((CURRENT_YEAR - hireYear) < 15 ) {
        return calculateSalary()*2.2;
    } else return 0; //возвращаем ноль, чтобы хоть что-то вернуть в этом методе.
}
    public BaseEmployee(String name, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    abstract public double calculateSalary();

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
