/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.Model;

import Electricity.LastBill;
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
public class LastBillTest {
    LastBill c;
    @Before
    public void setup () throws Exception {
        c = new LastBill();
    }
    @Test
    public void testLastBill() {
        assertEquals(1400,c.LastBill(250),0);
    }
    
}
