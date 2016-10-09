package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class QtyDiscount implements DiscountStrategy {
    private double rate = .10;
    private double minQty = 2;

    public QtyDiscount(double rate, int minQty) {
    }

    public final double getRate() {
        return rate;
    }

    public final void setRate(double rate) {
        this.rate = rate;
    }

    public final double getMinQty() {
        return minQty;
    }

    public final void setMinQty(double minQty) {
        this.minQty = minQty;
    }
    
    
    
    @Override
    public final double getDiscountAmount(double qty, double unitPrice) {
        if(qty>=minQty){
            return unitPrice * qty * rate;
        } else {
            return unitPrice * qty;
        }
    }

   
    
}
