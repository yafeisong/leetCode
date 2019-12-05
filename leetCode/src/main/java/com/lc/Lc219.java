package com.lc;

public class Lc219 {
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7,8,9,9};
		
		Lc219 lc = new Lc219() ;
		System.out.println(lc.containsNearbyDuplicate(nums, 3));
	}
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	
    	if(nums==null || nums.length==0){
    		return false;
    	}
    	int index = 0 ;
    	while(index<nums.length){
    		int next = index +1 ;
    		while(next<=index+k){
    			if(next > nums.length-1){
    				break;
    			}
    			if(nums[index]==nums[next]){
    				return true;
    			}
    			next ++;
    		}
    		index ++;
    	}
    	return false;
    }
}
