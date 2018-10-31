package cc.yitong0768.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.security.InvalidParameterException;

import org.junit.Test;

/**
 * Unit test for FizzBuzz.
 */
public class FizzBuzzTest {
	private FizzBuzz game = new FizzBuzz();

	@Test
	public void testIsMultiContainN_stage1_Exception_00() {
		try {
			game.isMultiContainN(10, 0, false);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}

	@Test
	public void testIsMultiContainN_stage1_Exception_01() {
		try {
			game.isMultiContainN(10, -1, false);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}

	@Test
	public void testIsMultiContainN_stage1_Exception_02() {
		try {
			game.isMultiContainN(-1, 5, false);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}

	@Test
	public void testIsMultiContainN_stage1_00() {
		assertTrue(true == game.isMultiContainN(0, 3, false));
	}

	@Test
	public void testIsMultiContainN_stage1_01() {
		assertTrue(true == game.isMultiContainN(0, 1, false));
	}

	@Test
	public void testIsMultiContainN_stage1_02() {
		assertTrue(true == game.isMultiContainN(1, 1, false));
	}

	@Test
	public void testIsMultiContainN_stage1_03() {
		assertTrue(true == game.isMultiContainN(6, 3, false));
	}

	@Test
	public void testIsMultiContainN_stage1_04() {
		assertTrue(false == game.isMultiContainN(6, 4, false));
	}

	@Test
	public void testIsMultiContainN_stage1_05() {
		assertTrue(true == game.isMultiContainN(1985625425, 397125085, false));
	}
	
	@Test
	public void testIsMultiContainN_stage1_06() {
		assertTrue(false == game.isMultiContainN(1985625425, 397125086, false));
	}

	@Test
	public void testIsMultiContainN_stage2_Exception_00() {
		try {
			game.isMultiContainN(10, 0, true);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}

	@Test
	public void testIsMultiContainN_stage2_Exception_01() {
		try {
			game.isMultiContainN(10, -2, true);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}

	@Test
	public void testIsMultiContainN_stage2_Exception_02() {
		try {
			game.isMultiContainN(-3, 5, true);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}

	@Test
	public void testIsMultiContainN_stage2_00() {
		assertTrue(true == game.isMultiContainN(0, 3, true));
	}

	@Test
	public void testIsMultiContainN_stage2_01() {
		assertTrue(true == game.isMultiContainN(0, 1, true));
	}
	
	@Test
	public void testIsMultiContainN_stage2_02() {
		assertTrue(true == game.isMultiContainN(1, 1, true));
	}

	@Test
	public void testIsMultiContainN_stage2_03() {
		assertTrue(true == game.isMultiContainN(6, 3, true));
	}

	@Test
	public void testIsMultiContainN_stage2_04() {
		assertTrue(true == game.isMultiContainN(13, 3, true));
	}

	@Test
	public void testIsMultiContainN_stage2_05() {
		assertTrue(false == game.isMultiContainN(14, 3, true));
	}

	@Test
	public void testIsMultiContainN_stage2_06() {
		assertTrue(true == game.isMultiContainN(13456, 34, true));
	}
	
	@Test
	public void testPrintInRange_Exception_00() {
		try {
			game.printInRange(-1, 5, false);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}
	
	@Test
	public void testPrintInRange_Exception_01() {
		try {
			game.printInRange(-1, -5, false);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}
	
	@Test
	public void testPrintInRange_Exception_02() {
		try {
			game.printInRange(0, -5, false);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}
	
	@Test
	public void testPrintInRange_Exception_03() {
		try {
			game.printInRange(5, 4, false);
		} catch (InvalidParameterException e) {
			return;
		}
		fail();
	}
	
	@Test
	public void testPrintInRange_stage1_00() {
		assertTrue(("1\n").equals(game.printInRange(1, 1, false)));
	}
	
	@Test
	public void testPrintInRange_stage1_01() {
		assertTrue(("13\n").equals(game.printInRange(13, 13, false)));
	}

	@Test
	public void testPrintInRange_stage1_02() {
		assertTrue(("Fizz\n").equals(game.printInRange(3, 3, false)));
	}

	@Test
	public void testPrintInRange_stage1_03() {
		assertTrue(("Buzz\n").equals(game.printInRange(5, 5, false)));
	}

	@Test
	public void testPrintInRange_stage1_04() {
		assertTrue(("FizzBuzz\n").equals(game.printInRange(15, 15, false)));
	}
	
	@Test
	public void testPrintInRange_stage1_05() {
		assertTrue(("1\n" + 
				"2\n" + 
				"Fizz\n" + 
				"4\n" + 
				"Buzz\n" + 
				"Fizz\n" + 
				"7\n" + 
				"8\n" + 
				"Fizz\n" + 
				"Buzz\n" + 
				"11\n" + 
				"Fizz\n" + 
				"13\n" + 
				"14\n" + 
				"FizzBuzz\n" + 
				"16\n").equals(game.printInRange(1, 16, false)));
	}

	@Test
	public void testPrintInRange_stage2_00() {
		assertTrue(("1\n").equals(game.printInRange(1, 1, true)));
	}

	@Test
	public void testPrintInRange_stage2_01() {
		assertTrue(("Fizz\n").equals(game.printInRange(13, 13, true)));
	}

	@Test
	public void testPrintInRange_stage2_02() {
		assertTrue(("Fizz\n").equals(game.printInRange(3, 3, true)));
	}

	@Test
	public void testPrintInRange_stage2_03() {
		assertTrue(("Buzz\n").equals(game.printInRange(52, 52, true)));
	}
	
	@Test
	public void testPrintInRange_stage2_04() {
		assertTrue(("FizzBuzz\n").equals(game.printInRange(51, 51, true)));
	}

	@Test
	public void testPrintInRange_stage2_05() {
		assertTrue(("Buzz\n").equals(game.printInRange(5, 5, true)));
	}

	@Test
	public void testPrintInRange_stage2_06() {
		assertTrue(("FizzBuzz\n").equals(game.printInRange(15, 15, true)));
	}
	
	@Test
	public void testPrintInRange_stage2_07() {
		assertTrue(("1\n" + 
				"2\n" + 
				"Fizz\n" + 
				"4\n" + 
				"Buzz\n" + 
				"Fizz\n" + 
				"7\n" + 
				"8\n" + 
				"Fizz\n" + 
				"Buzz\n" + 
				"11\n" + 
				"Fizz\n" + 
				"Fizz\n" + 
				"14\n" + 
				"FizzBuzz\n" + 
				"16\n").equals(game.printInRange(1, 16, true)));
	}
	
	@Test
	public void testPrintInRange_stage2_08() {
		assertTrue(("49\n" + 
				"Buzz\n" + 
				"FizzBuzz\n" + 
				"Buzz\n" + 
				"FizzBuzz\n" + 
				"FizzBuzz\n" + 
				"Buzz\n" + 
				"Buzz\n" + 
				"FizzBuzz\n" + 
				"Buzz\n" + 
				"Buzz\n" + 
				"FizzBuzz\n" + 
				"61\n").equals(game.printInRange(49, 61, true)));
	}
}
