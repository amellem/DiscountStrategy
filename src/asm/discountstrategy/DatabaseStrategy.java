package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public interface DatabaseStrategy {
    
 public Customer findCustomerByID(String customerID);
 public Product findProductByID(String productID);
}
