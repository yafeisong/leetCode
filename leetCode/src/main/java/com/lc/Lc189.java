package com.lc;

import java.util.Arrays;

public class Lc189 {
//	输入: [1,2,3,4,5,6,7] 和 k = 3
//			输出: [5,6,7,1,2,3,4]
	
	public static void main(String[] args) {
		int [] nums = {-1,-100,3,99};
		rotate(nums, 2);
		System.out.println(Arrays.toString(nums));
	}
	
    public static void rotate(int[] nums, int k) {
    	while(k>0){
    		int tmp = nums[nums.length-1];
    		int transIndex = nums.length-1 ;
    		while(transIndex>0){
    			nums[transIndex]=nums[transIndex-1];
    			transIndex -- ;
    		}
    		nums[0]=tmp;
    		k--;
    	}
    }
	
}
