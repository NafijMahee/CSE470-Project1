/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.Model;

import Electricity.pay_bill;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nmahe
 */
public class pay_billTest {
    
    pay_bill b;
    @Before
    public void setUp() throws Exception {
         b = new pay_bill();
    }  
    /**
     * Test of payBill method, of class pay_bill.
     */
    @Test
    public void testpBill() {
        assertEquals(1950,b.payBill(1500,450));
    }    
    
}
