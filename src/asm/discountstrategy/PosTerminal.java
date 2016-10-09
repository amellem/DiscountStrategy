package asm.discountstrategy;


public class PosTerminal {
    private Receipt receipt;
    private OuputStrategy[] outputs;
    
    public final void startNewSale(String customerID, DatabaseStrategy db){
        receipt = new Receipt(customerID, db);
        
    }
       
   public final void addNewProductToSale(String productID, int qty){
      receipt.addItemToReceipt(productID, qty);
        
    }
    
    
    public final void endSale(){
        for(OuputStrategy out : outputs){
            out.outputReceipt(receipt);
        }
        
    }
    
    public final Receipt getReceipt(){
        return receipt;
    }
    
    public final void setReceipt(Receipt receipt){
        this.receipt = receipt;
    }
    
    
}
