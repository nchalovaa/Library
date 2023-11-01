package lesson_16;
/* Цель: Создать класс "Банковский счет" с использованием инкапсуляции и реализовать методы для внесения и снятия средств.

Создайте класс с именем "БанковскийСчет" (BankAccount) с приватными полями:

accountNumber (номер счета, строковое значение)
balance (баланс счета, десятичное число с двумя знаками после запятой)
Добавьте конструктор класса, который принимает параметры для номера счета и начального баланса и инициализирует объект при его создании.

Создайте геттеры и сеттеры для номера счета и баланса.

Создайте метод deposit, который принимает сумму для внесения и увеличивает баланс счета на эту сумму.
Создайте метод withdraw, который принимает сумму для снятия и уменьшает баланс счета на эту сумму, если на счету достаточно средств.
Если сумма для снятия больше баланса, выведите сообщение об ошибке.
В методе main создайте объекты класса "BankAccount", инициализируйте их с помощью конструктора и выведите информацию о счетах,
балансах и произведите операции по внесению и снятию средств.

Попробуйте разные операции с внесением и снятием средств, включая случаи, когда на счету недостаточно средств. */


public class bank_account {
    private String accountNumber; // 100
    private double balance;

    public void BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Создайте метод deposit, который принимает сумму для внесения и увеличивает баланс счета на эту сумму.
    // Создайте метод withdraw, который принимает сумму для снятия и уменьшает баланс счета на эту сумму, если на счету достаточно средств.
    // Если сумма для снятия больше баланса, выведите сообщение об ошибке.

    public void deposit(double summ) {
        this.balance += summ;
    }

    public void withdraw(double summ) {
        if (this.balance >= summ) {
            this.balance -= summ;
            System.out.println("Сумма " + summ + " получена");
        } else {
            System.out.println("Не достаточно денег на вашем счету. Текуцщий баланс:" + this.balance);
        }
    }
}
