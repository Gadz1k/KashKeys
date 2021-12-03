public class Game {
    private static int count = 0;
    private int id;
    private String name;
    private double price;
    private int quantity;

    /**
     * @param name nazwa gry
     * @param price cena gry
     * @param quantity ilość dostępnych sztuk
     * oraz autoinkrementowane id, którego nie trzeba podawać podczas dodawania gry
     */
    public Game(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        id = setId(++count);
    }

    /**
     * Funkcja toString() zwracająca parametry gry
     */
    @Override
    public String toString() {
        return id+". Nazwa: "+name+" Cena: "+price+"PLN Ilość sztuk: "+quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}