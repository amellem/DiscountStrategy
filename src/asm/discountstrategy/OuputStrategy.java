package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public interface OuputStrategy {
    public final static String THANK_YOU = "Thank you ";
    public final static String FOR_SHOPPING = "for shopping at ";
    public final static String ITEM_ID = "ID";
    public final static String ITEM_NAME = "Item";
    public final static String UNIT_COST = "Unit cost";
    public final static String QTY = "Qty";
    public final static String PRICE = "Price";
    public final static String DISCOUNT_AMT = "Discount";
    public final static String GRAND_TOTAL = "Grand Total: ";
    public final static String TOTAL_BEFORE_DISCOUNT = "Total Before Discount: ";
    public final static String AMOUNT_SAVED = "Total Savings: ";
    
    public void outputReceipt(Receipt receipt);
}
