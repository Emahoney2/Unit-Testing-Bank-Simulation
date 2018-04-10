package banking;

import java.time.*;
import org.junit.*;

/**
 * @author wpollock
 *
 */


public class Transaction implements Comparable<Transaction> {
    private static int nextID = 1;

    private final int id;
    private final LocalDateTime timestamp;
    private final TransactionType type;
    private final double amount;
    private final String description;
    /**
     * @param type The type of this transaction
     * @param amount The amount of the transaction
     * @param description The description of the transaction.
     *        This may include check numbers, memo, payee, etc.
     */
    public Transaction (TransactionType type, double amount,
            String description) {
        this.id = 1;
        this.type = null;
        this.amount = 0.00;
        this.description = "";
        this.timestamp = LocalDateTime.now();
        // Stub
    }
    
    /**
     * @return the id
     */
    public int getId () {
        return 0;  // Stub
    }
    
    @Test
    public void testId()
    {
        id n = new id();
        n.setId(1);
    	Assert.assertEquals(1, n.getId());
    }

    /**
     * @return the timestamp for this transaction
     */
    public LocalDateTime getTimestamp () {
        return null;  // Stub
    }

    /**
     * @return the transaction type
     */
    public TransactionType getType () {
        return null;  // Stub
    }
    
    @Test
    public void testTransactionType()
    {
    	this.type = null;
    	Assert.ThrowsException<ArgumentNullException>()getType());
    }

    /**
     * @return the amount of this transaction.
     * Transaction amounts are always positive.
     */
    public double getAmount () {
        return 0.00;  // Stub
    }
    
    @Test
    public void testGetAmount()
    {
        amount a = new amount();
        a.setAmount(0.00);
    	Assert.assertEquals(0.00, a.getAmount());
    }

    /**
     * @return the description
     */
    public String getDescription () {
        return null;  // Stub
    }
    
    @Test
    public voidtestStringDescription()
    {
    	String description = "";
    	assertEquals("", expected);
    }

    @Override
    public String toString () {
        return "";  // Stub
    }

    @Override
    public int hashCode () {
        return 1;  // Stub
    }

    @Override
    public boolean equals (Object obj) {
        return false;  // Stub
    }

    @Override
    public int compareTo (Transaction other) {
        return 0;  // Stub
    }

}
