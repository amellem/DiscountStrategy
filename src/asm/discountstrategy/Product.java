package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class Product extends InMemoryDatabase{
    private String productID;
    private String name;
    private double unitPrice;
    private DiscountStrategy discount;

    public Product(String productID, String name, double unitPrice, DiscountStrategy discount) {
        this.productID = productID;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
}
