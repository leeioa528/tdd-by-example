package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public class Franc extends Money {

    //Now everything is money, all i have is a money and currency code
    public Franc(int amount, String currency) {
        super(amount, currency);
    }
}
