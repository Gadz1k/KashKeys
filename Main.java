import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char choice;
        Merchant aMerchant = new Merchant();
        Scanner scan = new Scanner(System.in);
        System.out.println("KashKeys");
        do{
            System.out.println("1. Kupno gier");
            System.out.println("2. Lista gier");
            System.out.println("3. Dodaj produkt");
            System.out.println("4. Zaaktualizuj produkt");
            System.out.println("5. Koszyk");
            System.out.println("6. Wyjdź ze sklepu");
                choice = scan.nextLine().charAt(0);
                switch (choice) {
                    case '1':
                        aMerchant.buyList();
                        break;
                    case '2':
                        aMerchant.displayGames();
                        break;
                    case '3':
                        aMerchant.addGame();
                        break;
                    case '4':
                        aMerchant.updateStock();
                        break;
                    case '5':
                        Basket.showBasket();
                        break;
                    case '6':
                        System.out.println("Dziękujemy za zakupy w naszym sklepie!");
                        break;
                    default:
                        System.out.println("Wprowadź poprawną liczbę!");
                }
        }while(choice != '6');
        scan.close();
    }
}
/**
 * @authors Karol Gadziejewski & Bartosz Kulling
 */