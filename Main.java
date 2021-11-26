import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Witamy w KashKeys!");
        System.out.println("1.Profil\n2.Produkty\n3.Panel Sprzedawcy\n4.Koszyk\n5.Zamknij sklep\n");
        Scanner scan = new Scanner(System.in);
        Integer option = scan.nextInt();
        switch (option){
            case 1:
                if(Person.ifLogged)
                    Person.profile();
                else
                    System.out.println("1.Login\n2.Rejestracja");
                    option = scan.nextInt();
                    switch(option){
                        case 1:
                            Person.login();
                        case 2:
                            Person.register();
                    }
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

    /**
     * Wyświetla listę gier
     */

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
    /**
     * Koszyk
     */
    public static void cart(){
        System.out.println("Twój koszyk jest pusty");
    }
    /**
     * Panel sprzedawcy
     */
    public static void merchantPannel(){
        System.out.println("Nie masz dostępu do panelu sprzedawcy");
    }
}
/**
 * Bartosz Kulling & Karol Gadziejewski
 */