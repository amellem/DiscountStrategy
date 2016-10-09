package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscountAmount(double qty, double unitPrice) {
       return unitPrice * qty;
    }

   

  
    
}
