import java.sql.SQLOutput;
import java.util.Scanner;

public class Person {
    protected static boolean ifLogged;
    protected String login;
    protected String email;
    protected String password;
    protected int id;
    protected int walletBalance;

    public Person(String login, String email, String password, int id, int walletBalance) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.id = id;
        this.walletBalance = walletBalance;
    }

    public static boolean isIfLogged() {
        return ifLogged;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public static void setIfLogged(boolean ifLogged) {
        Person.ifLogged = ifLogged;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    /**
     *    funkcja wyświetla profil użytkownika
     */
    public static void profile(){
        System.out.println("dane");
    }
    public static void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zaloguj się\nLogin:");
        String login = scan.next();
        System.out.println("Hasło:");
        String password = scan.next();
        ifLogged = true;
    }

    public static void register(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zarejestruj się\nLogin:");
        String login = scan.next();
        System.out.println("Email:");
        String email = scan.next();
        System.out.println("Hasło:");
        String password = scan.next();
        ifLogged = true;
    }
}
