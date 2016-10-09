package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public interface DiscountStrategy {
    
    public double getDiscountAmount(double qty, double unitPrice);
   
}
