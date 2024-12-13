import java.util.Scanner;
import java.util.InputMismatchException;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 500, 0),
                new CashCard("A002", 300, 0),
                new CashCard("A003", 1000, 1),
                //new CashCard("A004", 2000, 2),
                //new CashCard("A005", 3000, 3)
        };

        Scanner input = new Scanner(System.in);

        for (CashCard card : cards) {
            System.out.printf("為(%s, %d, %d)儲值",
                    card.getNumber(), card.getBalance(), card.getBonus());
            card.store(input.nextInt());
            //card.balance += input.nextInt();
            System.out.printf("明細(%s, %d, %d)儲值",
                    card.getNumber(), card.getBalance(), card.getBonus());
        }
        CashCard card = null;
        try {
            card = new CashCard("A004", 2000, 2);
            card.store(-100);

        } catch (NotMarchException ex) {
            System.out.println("錯誤訊息 : " + ex.getMessage());

        } catch (InputMismatchException ex) {
            System.out.println("必須輸入整數");
            System.out.println("錯誤訊息 : " + ex.getMessage());

        } finally {
            System.out.println("程式結束");
        }

        System.out.printf("明細(%s, %d, %d)儲值",
                card.getNumber(), card.getBalance(), card.getBonus());

    }
}

