/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.jsp.RegHandler_jsp;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sourabh
 */
public class RegHandler_jspIT {
    
    public RegHandler_jspIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDependants method, of class RegHandler_jsp.
     */
    @Test
    public void testGetDependants() {
        System.out.println("getDependants");
        RegHandler_jsp instance = new RegHandler_jsp();
        List<String> expResult = null;
        List<String> result = instance.getDependants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of _jspService method, of class RegHandler_jsp.
     */
    @Test
    public void test_jspService() throws Exception {
        System.out.println("_jspService");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        RegHandler_jsp instance = new RegHandler_jsp();
        instance._jspService(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
