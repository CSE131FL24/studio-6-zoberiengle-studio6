package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) {
			return 0;
		} else{
			return Math.pow(0.5, n)+ geometricSum(n-1);
		}

		// FIXME compute the geometric sum for the first n terms recursively


	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {

		// FIXME
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */

	public static int[] toReversed(int[] values) {
		int [] arr = Arrays.copyOf(values, values.length);
		int n = values.length-1;
		if (values.length == 1) {
			return arr;
		}
		else {
			return helper(arr,n); //start with last pos in array
		}
		// FIXME create a helper method that can recursively reverse the given array
	}
	public static int[] helper(int[]array, int index) {

		if (index>=array.length/2) {
			int lastIndex = array.length - 1;
			int mirrorIndex = lastIndex - index;
			int temp = array [index];
			array[index] = array[mirrorIndex];
			array[mirrorIndex] = temp;
			return helper(array,index-1);
		}
		return array;
	}


	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (q == 0) {
			return(p);
		}
		else {
			int temp = q;
			q = p % q;
			p = temp;
			return gcd(p,q);
		}
		// FIXME compute the gcd of p and q using recursion
		

	}




}

