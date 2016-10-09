package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class LineItem {
    private Product product;
    private double qty;

    public LineItem(String productID, double qty, DatabaseStrategy db) {
        setQty(qty);
        setProduct(db.findProductByID(productID));
        
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final double getQty() {
        return qty;
    }

    public final void setQty(double qty) {
        this.qty = qty;
    }

    public final double getSubTotal() {
        return product.getDiscount().getDiscountAmount(qty, product.getUnitPrice());
    }


    public final double getGrandTotal() {
        return 0.00;
    }
  
}
