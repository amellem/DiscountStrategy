package asm.discountstrategy;

/**
 *
 * @author amellem
 */
public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;

    public Customer(String customerID, String firstName, String lastName) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public final String getCustomerID() {
        return customerID;
    }

    public final void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }
   
   
    
}
