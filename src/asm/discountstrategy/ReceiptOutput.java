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
public final void outputReceipt(LineItem[] item){
    
 
    
    for(LineItem i : item){
        System.out.println(i.getProduct());
        
    }
    
    
}
    
   
    
}
