package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class ReceiptOutput implements OuputStrategy{
    private Receipt receipt;
    double totalBeforeDiscount = 0;
    double totalAfterDiscount = 0;
    double totalDiscount = 0;
@Override
public final void outputReceipt(Receipt item){
    
 
    LineItem[] items = receipt.getLineItems();
    for(LineItem i : items){
        totalBeforeDiscount += i.getProduct().getUnitPrice();
        
    }
    System.out.println(totalBeforeDiscount);
    
}
    
   
    
}
