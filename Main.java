import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Person{
    public Main(String login, String email, String password, String wiek, String shopName, int id, boolean ifLogged) {
        super(login, email, password, wiek, shopName, id);
    }

    public static void main(String[] args) {
        System.out.println("Witamy w KashKeys!");
        System.out.println("1.Profil\n2.Produkty\n3.Panel Sprzedawcy\n4.Koszyk\n5.Zamknij sklep\n");
        Scanner scan = new Scanner(System.in);
        Integer option = scan.nextInt();
        switch (option){
            case 1:
                profile();
                break;
            case 2:
                showProducts();
                break;
            case 3:
                merchantPannel();
                break;
            case 4:
                cart();
                break;
            case 5:
                break;
        }
    }
    //funkcja wyświetla profil użytkownika
    public static void profile(){
        boolean ifLogged = false;
        String login;
        String email;
        String password;
        Scanner scan = new Scanner(System.in);
        //sprawdza czy użytkownik jest zalogowany
        if(!ifLogged) {
            System.out.println("1.Logowanie\n2.Rejestracja");
            Integer opcja = scan.nextInt();
            switch(opcja){
                case 1:
                    //logowanie
                    System.out.println("Zaloguj się\nLogin:");
                    login = scan.next();
                    System.out.println("Hasło:");
                    password = scan.next();
                    System.out.println("Pomyślnie zalogowano!");
                    ifLogged = true;
                    break;
                case 2:
                    //rejestracja
                    System.out.println("Zarejestruj się\nEmail:");
                    email = scan.next();
                    System.out.println("Login:");
                    login = scan.next();
                    System.out.println("Hasło:");
                    password = scan.next();
                    System.out.println("Zarejestrowano pomyślnie");
                    break;
            }
        }
        else{
            System.out.println("dane");
        }
    }
    //Wyświetla listę gier
    public static void showProducts(){
        List<String> games = new ArrayList<String>();
        games.add("Epic Seven");
        games.add("Starcraft");
        games.add("Dead by Daylight");
        games.add("Overwatch");
        games.add("Crab Game");
        for(String game : games){
            System.out.println(game);
        }
    }
    //Koszyk
    public static void cart(){
        System.out.println("Twój koszyk jest pusty");
    }
    //Panel sprzedawcy
    public static void merchantPannel(){
        System.out.println("Nie masz dostępu do panelu sprzedawcy");
    }
}
//Bartosz Kulling i Karol Gadziejewski