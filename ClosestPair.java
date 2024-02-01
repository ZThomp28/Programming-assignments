/**
 * @author Yan Zong Ding
 * 
 * For ITEC 3150: Advanced Programming
 */

import java.util.*;

public class ClosestPair {
	
	/**
	 * An efficient algorithm for finding the closest pair of numbers in an array.
	 * Works by first sorting the array and then finding the closest adjacent pairs.
	 * 
	 * Time Complexity: O(n log n)
	 * 
	 * @param A  an array of numbers
	 * @return   the distance between the closest pair
	 */
	public static long closestPairFast(long[] A) {
		long min = Long.MAX_VALUE;
		int n = A.length;
		
		long[] B = new long[n];
		System.arraycopy(A, 0, B, 0, n);
		
		Arrays.sort(B);
		
		for (int i = 0; i < n-1; i++) {
			/**
			 * Here we assume that overflow does not occur so that
			 * Math.abs(A[i] - A[j]) is still in the range of long integers
			 */
			long dist = Math.abs(B[i] - B[i+1]);
			if (dist < min) {
				min = dist;
			}
		}
		
		return min;
	}
	
	
	/**
	 * A naive and inefficient algorithm for finding the closest pair of numbers in an array.
	 * Works by brute force, i.e. looking at every pair of elements and finding the closest pair.
	 * 
	 * Time Complexity: O(n^2)
	 * 
	 * @param A  an array of numbers
	 * @return   the distance between the closest pair
	 */
	public static long closestPairSlow(long[] A) {
		long min = Long.MAX_VALUE;
		int n = A.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				/**
				 * Here we assume that overflow does not occur so that
				 * Math.abs(A[i] - A[j]) is still in the range of long integers
				 */
				long dist = Math.abs(A[i] - A[j]);
				if (dist < min) {
					min = dist;
				}
			}
		}
		
		return min;
	}

	
	/**
	 * Test driver for the above two methods for closest pairs
	 */
	public static void main(String[] args) {
		int n = 100000;
		long[] A = new long[n];
		Random rand = new Random();
		
		/**
		 * Generate a test input array consisting of random numbers
		 */
		for (int i = 0; i < n; i++) {
			A[i] = (long) ((rand.nextDouble() - 0.5) * (1L << 60));
		}
		
		/**
		 * Run and time closestPairFast
		 */
		long tic = System.currentTimeMillis();
		long minDist = closestPairFast(A);
		long toc = System.currentTimeMillis();
		
		System.out.println("closestPairFast: ");
		System.out.println("min distance = " + minDist);
		System.out.println("time elapsed: " + (double)(toc-tic) / 1000);
		System.out.println();

		/**
		 * Run and time closestPairSlow
		 */
		long tic2 = System.currentTimeMillis();
		long minDist2 = closestPairSlow(A);
		long toc2 = System.currentTimeMillis();
		
		System.out.println("closestPairSlow: ");
		System.out.println("min distance = " + minDist2);
		System.out.println("time elapsed: " + (double)(toc2-tic2) / 1000);
	}

}
