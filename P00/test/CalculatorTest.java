import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	public void testSubstract(){
	       int a = 4321;
	       int b = 3321;
	  
	       Calculator cal = new Calculator();
	       int actual = cal.substract(a, b);

	     int expected = 1000;
	     assertEquals (expected, actual);
	     }
	
	public void testMultiple(){
	       int a = 34;
	       int b = 100;
	  
	       Calculator cal = new Calculator();
	       int actual = cal.multiple(a, b);

	     int expected = 3400;
	     assertEquals (expected, actual);
	     }
	
	public void testDivide(){
	       int a = 3400;
	       int b = 34;
	  
	       Calculator cal = new Calculator();
	       int actual = cal.divide(a, b);

	     int expected = 100;
	     assertEquals (expected, actual);
	     }

}
