package asm.discountstrategy;

/**
 *
 * @author amellem
 */

public class Receipt {
    private Customer customer;
    private DatabaseStrategy db;
    private LineItem[] lineItems;
    
    public Receipt(String customerID, DatabaseStrategy db){
        setDb(db);
        customer = findCustomerByID(customerID);
        lineItems = new LineItem[0];
        
    }
    
    public final DatabaseStrategy getDb(){
        return db;
    }
    
    
    public final void setDb(DatabaseStrategy db){
        this.db = db;
    }
    
    public final Customer findCustomerByID(String customerID){
        return db.findCustomerByID(customerID);
    }
    
    public final Product findProductByID(String productID){
        return db.findProductByID(productID);
    }
    
    public final void addItemToReceipt(String productID, double qty){
        LineItem item = new LineItem(productID, qty, db);
        addItemToArray(lineItems, item);
        
    }
    
    public final void addItemToArray(LineItem[] origArray, LineItem item){
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length - 1] = item;
        origArray = tempArray;
        lineItems = origArray;
    }
    
    public final LineItem[] getLineItems(){
        return lineItems;
    }
    
}
