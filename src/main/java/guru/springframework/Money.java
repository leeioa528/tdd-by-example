package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public abstract class Money {
    protected int amount;

    //subsclasses will provide there own implementations
    public abstract Money times(int multiplier);

    //helper methods
    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.getClass().equals(object.getClass());
    }
}
