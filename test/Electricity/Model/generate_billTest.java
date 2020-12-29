/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.Model;

import Electricity.generate_bill;
import java.awt.event.ActionEvent;
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
public class generate_billTest {
    generate_bill c;
    @Before
    public void setUp() throws Exception {
         c = new generate_bill();
    }
    /**
     * Test of generate_bill method, of class pay_bill.
     */
    @Test
    public void testGenera_bill() {
        assertEquals(1500,c.genera_bill(1050,450));
    }  
    
}
