package lesson_21.Bank;

import lesson_21.Bank.Bank;
import lesson_21.Bank.BankCard;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(50);

        for (int i = 0; i < 60; i++) {
            BankCard bankCard = new BankCard("Andre", "Reutow");
            bank.addCard(bankCard);
        };

        ATM atm = new ATM();
        //atm.withdraw(bankCard, 100);
        //atm.deposit(bankCard, 100);
        //atm.showBalance(bankCard);
    }
}
