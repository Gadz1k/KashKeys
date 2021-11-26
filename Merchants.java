import java.util.ArrayList;
import java.util.List;

public class Merchants extends Person{
    protected String shopName;
    protected int rating;
    protected int soldKeys;
    protected int revenue;
    protected List<String> games = new ArrayList<>();

    public Merchants(String login, String email, String password, int id, int walletBalance, String shopName, int rating, int soldKeys, int revenue, List<String> games) {
        super(login, email, password, id, walletBalance);
        this.shopName = shopName;
        this.rating = rating;
        this.soldKeys = soldKeys;
        this.revenue = revenue;
        this.games = games;
    }
}
