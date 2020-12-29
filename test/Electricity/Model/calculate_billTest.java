/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.Model;

import Electricity.calculate_bill;
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
public class calculate_billTest {
    calculate_bill c;
    @Before
    public void setup () throws Exception {
        c = new calculate_bill();
    }
    @Test
    public void testCalculate_bill() {
       assertEquals(2000,c.cal_bill(1050,450, 500));
    }
    
}
