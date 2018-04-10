package banking;

import java.util.*;

/**
 * @author wpollock
 *
 */
public class Customer implements Comparable<Customer> {
    private static int nextId = 1;

    private final Bank bank;
    private final String customerId;
    private final String lastName;
    private final String firstName;
    private final SortedSet<Account> customerAccounts = new TreeSet<>();

    /** Creates a new Customer object from a name.
     * Note for this project, we assume bank names are unique.
     * @param bank The bank owning this account
     * @param lastName The last name of the account owner.
     * @param firstName The first name of the account owner.
     */
    public Customer (Bank bank, String lastName, String firstName) {
        this.bank = null;
        this.customerId = "";
        this.lastName = "";
        this.firstName = "";
        // Stub
    }

    /**
     * @return the bank
     */
    public Bank getBank () {
        return null;  // Stub
    }
    @Test
    public void getBank() {
    	bank n = new bank();
    	n.setbank(1);
    	Assert.assertEquals(1, n.getBank());
    }
    /** Getter for customer's ID
     * @return The customer's ID
     */
    public String getCustomerId () {
        return null;  // Stub
    }
    
    @Test
    public void getCustomerId()
    {
    	customerid n = new customerid();
    	n.setcustomerId(1);
    	Assert.assertEquals(1, n.getcustomerId());
    }
    /** Getter for the customer's last name
     * @return The customer's last name
     */
    public String getLastName () {
        return null;  // Stub
    }

    @Test
    public voidStringLastName() {
    	String description = "";
    	assertEquals("", expected);
    	
    }
    /** Getter for the customer's first name
     * @return The customer's first name
     */

    public String getFirstName () {
        return null;  // Stub
    }

    @Test
    public voidStringFirstName() {
    	String description = "";
    	assertEquals("", expected);
    	
    }
    /** Returns a read-only SortedSet of the customer's active
     *  accounts (if any)
     *
     * @return an immutable SortedSet of accounts (check for
     *  immutability of accounts; use a List?)
     */
    public SortedSet<Account> getCustomerAccounts () {
        return null;  // Stub
    }
    
    @Test
    public void
    customerAccount n = new customerAccount();
	n.setcustomerAccount(1);
	Assert.assertEquals(1, n.getcustomerAccount());
    /** Returns the total fees (including penalties) paid by this customer
     *  for year-to-date
     *
     * @return YTD fees paid
     */
    public double ytdFees () {
        return 0.0;  // Stub
    }
    
    @Test
    public void ytdFees() {
    	fees a = new fees();
    	a.setFees(0.0);
    	Assert.assertEquals(0.0, a.getFees());	
    }
    /** Returns the total interest paid to this customer for year-to-date
     * @return YTD interest payed
     */
    public double ytdInterest () {
        return 0.0;  // Stub
    }
    
    @Test
    public void ytdInterest{
    	interest a = new interest();
    	a.setInterest(0.0);
    	Assert.assertEquals(0.0, a.getFee());
    }
    /** Adds a new bank account
     * @param initBal Initial balance
     * @param desc A description for the account, chosen by the customer
     * @return the newly added account object
     */
    public SavingsAccount addSavingsAccount (double initBal,  String desc) {
        return null;  // Stub
    }    
    /** Deletes a given account (in the real world, just marks it as defunct
     *  or something)
     * @param accountId the ID of the account to remove
     */
    public void removeAccount (String accountId) {
        // Stub
    }

    @Test
    public void removeAccount() {
    	String description = "";
    	assertEquals("", expected);
    	
    }
    /** Find an account given an account ID
     *
     * @param accountId The ID of the desired account
     * @return The Account object, or null if no such account
     */
    public Account getAccount (String accountId) {
        return null;  // Stub
    }
    
    @Test
    public void getAccount() {
    	String description = "";
    	assertEquals("", accountId);
    }

    @Override
    public String toString () {
        return "";  // Stub
    }

    @Override
    public int hashCode () {
        return 0;  // Stub
    }

    @Override
    public boolean equals (Object obj) {
        return false;  // Stub
    }

    @Override
    public int compareTo (Customer other) {
        return 1;  // Stub
    }
}
