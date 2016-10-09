package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class PercentOffDiscount implements DiscountStrategy {
    private double rate = .10;

    public PercentOffDiscount(double rate) {
        this.rate = rate;
    }
    
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    

    @Override
    public double getDiscountAmount(double qty, double unitPrice) {
        return unitPrice * qty * rate;
    }
    
}
