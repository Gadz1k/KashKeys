import java.util.Scanner;

public class Person {
    private static boolean ifLogged;
    private String login;
    private String email;
    private String password;
    private double walletBalance;

    public Person(String login, String email, String password, double walletBalance) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.walletBalance = walletBalance;
    }

    public static boolean isIfLogged() {
        return ifLogged;
    }

    public static void setIfLogged(boolean ifLogged) {
        Person.ifLogged = ifLogged;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}
