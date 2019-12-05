package com.lc;

import java.util.Arrays;

public class Lc581 {

	public static void main(String[] args) {
		Lc581 lc = new Lc581();

		int[] nums = { 1, 2, 3, 5, 4 };
		System.out.println(lc.findUnsortedSubarray(nums));
	}

	// public int findUnsortedSubarray(int[] nums) {
	// int [] rs = new int [nums.length];
	// for(int index = 0 ;index <nums.length; index ++){
	// rs[index] = nums[index] ;
	// }
	// Arrays.sort(nums);
	// int endIndex = rs.length-1 ;
	// int start = -1 ;
	// int end = -1 ;
	// for(int index = 0 ;index <nums.length; index ++){
	// if (rs[index] != nums[index]){
	// start = start == -1 ?index:start;
	// }
	// if(rs[endIndex] != nums[endIndex]){
	// end = end == -1?endIndex:end;
	// }
	// if(end != -1 && start !=-1){
	// break;
	// }
	// endIndex -- ;
	// }
	// int count = 0 ;
	// if (end != -1 && start != -1 ){
	// count = end - start +1 ;
	// }
	// return count ;
	// }

	public int findUnsortedSubarray(int[] nums) {
		int len = nums.length;
		if (len <= 1){
			return 0;
		}
		int high = -1, low = -1, max = nums[len-1], min = nums[0];
		for (int i = 1; i < len; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[len-i-1]);
			if (nums[i] < min)
				low = low == -1 ?len - 1 - i:low;
			if (nums[len - 1 - i] > max)
				high = high == -1?i:high;
		}
		return high > low ? high - low + 1 : 0;
	}
//	public int findUnsortedSubarray(int[] nums) {
//		int len = nums.length;
//		if (len <= 1){
//			return 0;
//		}
//		int high = 0, low = len - 1, max = nums[0], min = nums[len - 1];
//		for (int i = 1; i < len; i++) {
//			max = Math.max(max, nums[i]);
//			min = Math.min(min, nums[len - 1 - i]);
//			if (nums[i] < max)
//				high = i;
//			if (nums[len - 1 - i] > min)
//				low = len - 1 - i;
//		}
//		return high > low ? high - low + 1 : 0;
//	}
}
