package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public interface OutputStrategy {
    
    public void createReceipt(Customer customer, LineItem[] item);
    public void outputReceipt();
}
