package com.lc;

import java.util.Arrays;

public class Lc136 {
	
	public static void main(String[] args) {
		int [] nums = {2,2,1};
		System.out.println(singleNumber(nums)) ;
	}
	
    public static int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	for(int index =0;index<nums.length-1;index++){
    		if(nums[index+1]!=nums[index]){
    			return nums[index];
    		}
    		index +=1;
    	}
        return nums[nums.length-1] ;
    }
}
