import java.util.*;

public class Merchant{
    private final List<Game> gameList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    private static int count;
    private String shopName;
    private int rating;
    private int soldKeys;
    private int revenue;

    /**
     * Funkcja która umożliwia dodanie gry do listy z wartościami,
     * nazwą gry, ceną, oraz ilością dostępnych sztuk
     */
    public void addGame() {
        String aName;
        double aPrice = 0;
        int aQuantity;
        System.out.println("Nazwa: ");
        aName = scan.nextLine();
        System.out.println("Cena: ");
        aPrice = scan.nextDouble();
        System.out.println("Ilość: ");
        aQuantity = scan.nextInt();
        scan.nextLine();
        Game aGame = new Game(aName, aPrice, aQuantity);
        gameList.add(aGame);
    }

    /**
     * updateStock umożliwia zaaktualizowanie obecnych danych w liście,
     * wybierając najpierw co chcemy zrobić a później id gry i zmieniając element listy
     */
    public void updateStock() {
        int choice, gameID, quantity;
        double price;
        Game chosen;
        System.out.println("1.Zmień cenę");
        System.out.println("2.Dodaj więcej sztuk");
        choice = scan.nextInt();
        if(choice==1){
            displayGames();
            System.out.println("Podaj id gry której chcesz zmienić cenę:");
            gameID = scan.nextInt();
            System.out.println("Podaj nową cenę:");
            price = scan.nextDouble();
            chosen = gameList.get(gameID-1);
            chosen.setPrice(price);
            System.out.println("Cena została zmieniona");
        }
        else if(choice==2){
            displayGames();
            System.out.println("Podaj id gry której chcesz dodać więcej sztuk:");
            gameID = scan.nextInt();
            System.out.println("Ile sztuk chcesz dodać?");
            quantity = scan.nextInt();
            chosen = gameList.get(gameID-1);
            int currentQuantity = chosen.getQuantity();
            chosen.setQuantity(currentQuantity + quantity);
            System.out.println("Liczba sztuk została zmieniona");
        }
        else{
            System.out.println("Wpisz poprawny numer!");
            updateStock();
        }
    }

    /**
     * Funkcja wyświetla listę gier poprzez for each i rzutowanie do metody klasy
     */
    public void displayGames() {
        for (Object e : gameList) {
            System.out.println(((Game) e).toString());
        }
    }

    /**
     * Funkcja wyświetla listę gier z możliwością dodanie do koszyka poprzez wpisanie id gry i zatwierdzenie
     */
    public void buyList(){
        int choice, gameID;
        Game chosen;
        displayGames();
        gameID = scan.nextInt()-1;
        chosen = gameList.get(gameID);
        System.out.println("Czy chcesz dodać grę do koszyka?");
        System.out.println("1.Tak");
        System.out.println("2.Nie");
        choice = scan.nextInt();
        if(choice == 1){
            Basket.basketProducts.add(chosen.getName());
        }
        else if(choice == 2){
            buyList();
        }
        else{
            System.out.println("Podałeś nieprawidłową liczbę!");
            return;
        }
    }
}
