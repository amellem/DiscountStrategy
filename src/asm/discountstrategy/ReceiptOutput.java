package asm.discountstrategy;

import java.text.DecimalFormat;
/**
 *
 * @author amellem
 */
public class ReceiptOutput implements OutputStrategy{
    private double totalBeforeDiscount;
    private double totalDiscount;
    private String receiptData = "";
    DecimalFormat convertMoney = new DecimalFormat("#0.00");
    
@Override
public final void createReceipt(Customer customer, LineItem[] item){
    
    
    
    receiptData += "\t\t     Kohl's\n-----------------------------------------------\n\nCustomer: " + customer.getFirstName() + " " + customer.getLastName() + "\n\n";
        for (LineItem i : item){
            receiptData += i.getProduct().getName() + "\t\tQty: " + i.getProduct().getQuantity() + "\t\t" + i.getProduct().getProductID() + "\t" + convertMoney.format((i.getProduct().getUnitPrice() * i.getProduct().getQuantity()) - i.getProduct().getDiscount()) + "\n" +
                    "    Item cost: " + convertMoney.format(i.getProduct().getUnitPrice()) + "\t    You save: " + convertMoney.format(i.getProduct().getDiscount()) + "\n\n";
            totalBeforeDiscount += i.getProduct().getUnitPrice() * i.getProduct().getQuantity();
            totalDiscount += i.getProduct().getDiscount();            
        }
        
        receiptData += "\t\t\t      Subtotal: " + convertMoney.format(totalBeforeDiscount) + "\n\t\t\t      Discount: " + convertMoney.format(totalDiscount) + 
                "-\n\t\t\t\t Total: " + convertMoney.format(totalBeforeDiscount - totalDiscount) + "\n\n-----------------------------------------------\n" +
                "\tThank you for shopping at Kohl's!\n" ;
    
   
}

    @Override
    public final void outputReceipt() {
        System.out.println(receiptData);
    }
    
   
    
}
