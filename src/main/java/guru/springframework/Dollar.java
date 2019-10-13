package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    //abstract method implemented
    public Money times( int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
