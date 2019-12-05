package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lc283 {
	
	public static void main(String[] args) {
		Lc283 lc = new Lc283() ;
		int [] nums = {0,1,0,3,12};
		
		lc.moveZeroes(nums);
		
		System.out.println(Arrays.toString(nums));
		
		
	}	
		
//    public void moveZeroes(int[] nums) {
//    	int lastIndex = nums.length-1 ;
//    	for(int index =0;index<lastIndex;index ++){
//    		int tmp = 0 ;
//    		if(nums[index] == 0 ){
//    			if (nums[lastIndex] ==0){
//    				while(nums[lastIndex] == 0){
//    					lastIndex -- ;
//    				}
//    			}
//				tmp = nums[lastIndex] ;
//				nums[lastIndex]=nums[index];
//				nums[index] = tmp;
//				lastIndex -- ;
//    		}
//    	}
//    }
    public void moveZeroes(int[] nums) {
    	int lastIndex = nums.length-1 ;
    	int currIndex = -1 ;
    	for(int index =0;index<lastIndex;index ++){
    		if(nums[index] != 0 ){
    			continue ;
    		}else{
    			currIndex = index ;
    		}
    		while(nums[index] == 0){
    			index ++;
    			if (index > nums.length-1){
    				return ;
    			}
    		}
    		nums[currIndex] = nums[index];
    		nums[index] = 0 ;
    		index = currIndex ;
    	}
    }
//    public void moveZeroes(int[] nums) {
//    	List<Integer> list = new ArrayList<Integer> ();
//    	for(int index = 0 ;index<nums.length;index ++){
//    		if (nums[index] != 0){
//    			list.add(nums[index]) ;
//    		}
//    	}
//    	for(int index = 0 ;index<nums.length;index ++){
//    		if (index<list.size()){
//    			nums[index] = list.get(index) ;
//    		}else {
//    			nums[index] = 0 ;
//    		}
//    	}
//    }
}
