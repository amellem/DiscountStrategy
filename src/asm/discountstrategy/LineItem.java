package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class LineItem {
    private Product product;
    private double qty;
    private double discountAmount;

    public LineItem(Product product) {
        this.product = product;
        this.qty = product.getQuantity();
        this.discountAmount = product.getDiscount();
        
    }

    public final Product getProduct() {
        return product;
    }
  
}
