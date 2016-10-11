package asm.discountstrategy;


public class PosTerminal {
    private Receipt receipt;
    
    public final void startNewSale(String customerID, DatabaseStrategy db){
        receipt = new Receipt(customerID, db);
        
    }
       
   public final void addNewProductToSale(String productID, double qty){
      receipt.addItemToReceipt(productID, qty);
        
    }
    
    
    public final void endSale(OutputStrategy output){
        receipt.getLineItems(output);        
        }
   
}
