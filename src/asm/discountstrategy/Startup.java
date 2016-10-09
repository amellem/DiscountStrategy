
package asm.discountstrategy;

/**
 *
 * @author amellem
 */

public class Startup {

    
    public static void main(String[] args) {
        DatabaseStrategy db = new InMemoryDatabase();
        PosTerminal pos = new PosTerminal();
       
       
       pos.startNewSale("100", db);
       pos.addNewProductToSale("P101", 2);
       pos.addNewProductToSale("P102", 4);
       pos.addNewProductToSale("p103", 1);
       pos.endSale();
        
    }
    
}
