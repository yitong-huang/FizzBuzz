package cc.yitong0768.fizzbuzz;

import java.security.InvalidParameterException;

/**
 *
 *
 */
public class FizzBuzz {

	public final static int FIZZ_BASE = 3;
	public final static int BUZZ_BASE = 5;
	public final static int FROM = 1;
	public final static int TO = 100;

	/*
	 * @description Judge if a number is multiples of n, and if isStage2, judge if
	 * the number has a n in it.
	 * 
	 * @param num, should be >= 0.
	 * 
	 * @param n, should be > 0
	 * 
	 * @param isStage2, true if in stage2
	 * 
	 * @return boolean
	 */
	public boolean isMultiContainN(int num, int n, boolean isStage2) {
		if (n <= 0) {
			throw new InvalidParameterException("n should be > 0");
		}
		if (num < 0) {
			throw new InvalidParameterException("num should be >= 0");
		}
		if (num % n == 0) {
			return true;
		}
		if (isStage2) {
			if (("" + num).contains("" + n)) {
				return true;
			}
		}

		return false;
	}

	/*
	 * @description: print and return the numbers or fizz/buzz in range [from, to].
	 * 
	 * @param from, the lower bound, included.
	 * 
	 * @param to, the upper bound, included.
	 * 
	 * @param isStage2, true if in stage2
	 * 
	 * @return
	 * 
	 * @see isMultiContainN
	 */
	public String printInRange(int from, int to, boolean isStage2) {
		if (from < 0) {
			throw new InvalidParameterException("the lower bound should >= 0");
		}
		if (to < from) {
			throw new InvalidParameterException("the upper bound should >= lower bound");
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = from; i <= to; i++) {
			if (isMultiContainN(i, FIZZ_BASE, isStage2)) {
				if (isMultiContainN(i, BUZZ_BASE, isStage2)) { // both fizz and buzz
					builder.append("FizzBuzz\n");
					System.out.println("FizzBuzz");
				} else { // only fizz
					builder.append("Fizz\n");
					System.out.println("Fizz");
				}
			} else if (isMultiContainN(i, BUZZ_BASE, isStage2)) { // only buzz
				builder.append("Buzz\n");
				System.out.println("Buzz");
			} else {
				builder.append(i + "\n");
				System.out.println(i);
			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		new FizzBuzz().printInRange(FROM, TO, false);
	}
}
