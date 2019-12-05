package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc217 {
	
	public static void main(String[] args) {
		Lc217 lc = new Lc217() ;
		int [] nums = new int [29999+24500+2];
		
		for(int i = -24500;i<=29999;i++){
			nums[i+24500] = i;
		}
		nums[nums.length-1]=29999 ;
		
		System.out.println(Arrays.toString(nums));
		
		long start = System.currentTimeMillis() ;
		System.out.println(lc.containsDuplicate(nums));
		System.out.println(System.currentTimeMillis()-start);
	}
	
    public boolean containsDuplicate(int[] nums) {
    	if(nums == null || nums.length==0){
    		return false;
    	}
    	Arrays.sort(nums);
    	int index = 0 ;
    	int cache = nums[index];
    	index ++;
    	while(index<nums.length){
    		if(cache==nums[index]){
    			return true;
    		}
    		cache = nums[index];
    		index ++;
    	}
    	return false;
    }
}
