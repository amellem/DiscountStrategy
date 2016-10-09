package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class FlatAmtDiscount implements DiscountStrategy {
    private double flatDiscountAmt = 2.00;
    
    @Override
    public double getDiscountAmount(double qty, double unitPrice) {
       return unitPrice * qty - flatDiscountAmt;
    }

    

    
    
}
