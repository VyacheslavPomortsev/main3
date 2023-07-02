// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int onAccount = 500;
        int refill = 1000;

        int bonus = refill / 100;

        if (refill >= 1000) {
            System.out.println("Баланс клиента: " + (onAccount + refill + bonus));
        } else {
            System.out.println("Баланс клиента: " + (onAccount + refill));
        }
    }

}
