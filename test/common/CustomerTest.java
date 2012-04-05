package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author sfalbo
 */
public class CustomerTest {
    
    private Customer customer;

    public CustomerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        
        Customer customer = new Customer();
    }

    @After
    public void tearDown() {
        
        customer = null;
    }

    /**
     * This method tests the requirement that the address cannot be null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeNull() {
        customer.setAddress(null);

    }

    /**
     * This method tests the requirement that the address cannot be empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeEmpty() {
        customer.setAddress("");

    }

    /**
     * All valid addresses should pass.
     */
    @Test
    public void validAddressShouldPass() {
        customer.setAddress("1234 Anywhere Street");
    }
    
      /**
     * This method tests the requirement that the city cannot be null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void cityShouldNotBeNull() {
        customer.setCity(null);

    }

    /**
     * This method tests the requirement that the city cannot be empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void cityShouldNotBeEmpty() {
        customer.setCity("");

    }
    
    /**
     * This method is for comparing 2 phone numbers to be able to tell if the customer 
     * is the same. 
     */
    
    @Test
    public void phoneNumberShouldMatchAnotherPhoneNumber()
    {
        Customer customerA = new Customer();
        Customer customerB = new Customer();
    }    

}
