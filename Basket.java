import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {
    static Scanner scan = new Scanner(System.in);
    static List<String> basketProducts = new ArrayList<>();

    /**
     * Funckja pokazująca zawartość koszyka
     */
    public static void showBasket(){
        /**
         * Warunek sprawdzający czy koszyk jest pusty
         */
        if(basketProducts.isEmpty()) {
            System.out.println("Twój koszyk jest pusty");
        }
        else {
            char choice;
            /**
             * Pętla wyświetla produkty dodane do koszyka
             */
            for (String product : basketProducts) {
                System.out.println(product);
            }
            System.out.println("Czy chcesz złożyć zamówienie?");
            System.out.println("1.Tak");
            System.out.println("2.Nie");
            choice = scan.nextLine().charAt(0);
            /**
             * Switch który potwierdza czy chcemy złożyć zamówienie
             */
            switch (choice) {
                case '1':
                    System.out.println("Kupiłeś " + basketProducts.size() + " gier");
                case '2':
                    return;
                default:
                    System.out.println("Wprowadź poprawną liczbę!");
            }
        }
    }
}
