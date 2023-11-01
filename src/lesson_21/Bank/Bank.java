package lesson_21.Bank;
import lesson_21.Bank.AppConstants;

public class Bank {

    private BankCard[] cards;
    private int maxCards;
    private int numCards;

    public Bank(int maxCards) {
        this.maxCards = maxCards;
        this.cards = new BankCard[maxCards];
    }

    // Конструкторы и геттеры/сеттеры

    /**
     * Метод для добавления новой карты в банк.
     *
     * @param card Карта, которую нужно добавить.
     */
    public void addCard(BankCard card) {
        //AndreReutow
        String generatedCardNumber = card.getFirstName() + card.getLastName();
        card.setCardNumber(generatedCardNumber);
        card.setBalance(0);

        // todo пройтись по всему массиву и найти пустую ячейку для установки карточки
        // Если пустой ячейки нет, то указать пользователю, что наш банк больше не может принимать новых клиентов
        // card[] = card;


        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                return;
            }
        }
        System.out.println(AppConstants.CLIENT_AMOUNT_LIMIT);

        //Второй вариант решения
        // boolean isAdded = false;
       /* for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                System.out.println("Картя с номером " + card.getCardNumber() + "добавлена");
                break;
            }
        }
        if (isAdded == false) {
            System.out.println(AppConstants.CLIENT_AMOUNT_LIMIT);
        }*/
    }




    /**
     * Метод для поиска карты в банке.
     *
     * @param card Карта, которую нужно найти.
     * @return Если карточка найдена true, в противном случае false
     */
    public boolean findCard(BankCard card) {
        // Реализация метода
        // todo пройтись по массиву и найти карточку. Если карточка найдена, вернуть true, в противном случае false
        return false;
    }
}
