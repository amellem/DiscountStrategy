
package asm.discountstrategy;

/**
 *
 * @author amellem
 */

public class Startup {

    
    public static void main(String[] args) {
        DatabaseStrategy db = new InMemoryDatabase();
        PosTerminal pos = new PosTerminal();
        OutputStrategy output = new ReceiptOutput();
       
       
       pos.startNewSale("100", db);
       pos.addNewProductToSale("P100", 2.0);
       pos.addNewProductToSale("P102", 4.0);
       pos.addNewProductToSale("P103", 1.0);
       pos.endSale(output);
        
    }
    
}
