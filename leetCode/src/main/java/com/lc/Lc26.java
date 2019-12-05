package com.lc;

import java.util.Arrays;

public class Lc26 {

	public static void main(String[] args) {
		Lc26 lc = new Lc26() ;
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(lc.removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums) {
//    	int count = 0 ;
//		
//    	for(int index =0;index<nums.length-1;index ++){
//    		if(nums[index+1]==nums[index]){
//    			int tmp = nums[index+1];
//    			System.arraycopy(nums, index+2, nums, index+1, nums.length-index-2);
//    			nums[nums.length-1]=tmp;
//    			index -- ;
//    			
//    			if(nums[0]==nums[index+1]){
//    				
//    			}
//    		}
//    	}
//    	System.out.println(Arrays.toString(nums));
//     return nums.length-count;
		
		if (nums.length < 2) 
			return nums.length ;
		int j = 0;
		for (int i = 1; i < nums.length; i++)
			if (nums[j] != nums[i]) {
				nums[++j] = nums[i];
			}
		System.out.println(Arrays.toString(nums));
		return ++j;
		
    }
}
