/**
 *
 */
package com.javapractice.leetcode;

/**
 * @author Jianyu Feng
 * https://oj.leetcode.com/problems/sqrtx/
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 *
 */
public class SqrtX {
	public int sqrt(int x) {
		if (x <= 1) {
			return x;
		}

		int start=0, end=x;
		while (start < end-1) {
			int mid = start+(end-start)/2;

			if(x/mid == mid) {
				return mid;
			} else if(x/mid > mid) {
				start = mid;
			} else {
				end = mid;
			}
		}

		return start;
	}

	/*
	 * I am amazed by how great the numerical method works
	 * I learned before but forget a lot of them
	 */
	public int sqrtNewtonMethod(int x) {
		if (x<=0) {
			return 0;
		}

		double last = 0;
		double res = 1;
		while(res != last) {
			last = res;
			res = (res + x/res)/2;
		}

		return (int)res;
	}
}
