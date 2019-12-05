package com.lc;

import java.util.Arrays;

public class Lc268 {
	
	public static void main(String[] args) {
		int [] nums = {3,0,1};
		System.out.println(new Lc268().missingNumber(nums));
	}
	
    public int missingNumber(int[] nums) {
    	Arrays.sort(nums);
    	for(int i = 0;i<nums.length-1;i++){
    		if (i != nums[i]){
    			return i;
    		}
    	}
    	return nums.length ;
    }
}
