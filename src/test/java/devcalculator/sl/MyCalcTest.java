package devcalculator.sl;

import org.junit.Test;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import mypkg.MyCalc;

public class MyCalcTest extends TestCase {
	MyCalc calc=new MyCalc();
	
	@Test
	public void test() {
		assertEquals(40,calc.sum(30,10));
		assertEquals(20,calc.diff(30,10));


	}

}
