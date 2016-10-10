package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class InMemoryDatabase implements DatabaseStrategy{
    
    private Customer[] customers = {
      new Customer("C100", "Andrew", "Smith"),
      new Customer("C101", "Matt", "Jones"),
      new Customer("C102", "Ashley", "Michelles")
    };
    
    private Product[] products = {
        new Product("P100", "Popcorn", 10.99, new QtyDiscount(.10, 2)),
        new Product("P102", "Potato Chips", 7.99, new QtyDiscount(.10, 2)),
        new Product("P103", "T-Shirt", 12.99, new QtyDiscount(.10, 2)),
        new Product("P104", "Shoes", 79.99, new QtyDiscount(.10, 2))
    }; 
    
    @Override
    public final Customer findCustomerByID(String customerID){
        Customer customer = null;
        
        for(Customer c : customers){
            if(customerID.equals(c.getCustomerID())){
                customer = c;
                break;
            }
            
        }
        return customer;
    }
    
    @Override
    public final Product findProductByID(String productID){
        Product product = null;
        
        for(Product p : products){
            if(productID.equals(p.getProductID())){
                product = p;
                break;
            }
            
        }
        return product;
    }
    
 
    
}
