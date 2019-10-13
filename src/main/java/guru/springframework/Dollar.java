package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar extends Money {

    //Now everything is money, all i have is a money and currency code
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
