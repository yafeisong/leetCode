package com.lc;

public class Lc35 {
//	给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
//	你可以假设数组中无重复元素。
//
//	示例 1:
//
//	输入: [1,3,5,6], 5
//	输出: 2
//	示例 2:
//
//	输入: [1,3,5,6], 2
//	输出: 1
//	示例 3:
//
//	输入: [1,3,5,6], 7
//	输出: 4
//	示例 4:
//
//	输入: [1,3,5,6], 0
//	输出: 0
//
	
	
	public static void main(String[] args) {
		int [] arr = {1,3,5,6};
		int target = 0;
		
		System.out.println(searchInsert(arr, target));
	}
	
	
    public static int searchInsert(int[] nums, int target) {
    	for(int numIndex =0 ;numIndex<nums.length;numIndex ++){
    		int num = nums[numIndex];
    		if(num==target){
    			return numIndex ;
    		}
    		if(numIndex>=nums.length-1 && target>nums[nums.length-1]){
    			return nums.length;
    		}
    		if(target>num && target<nums[numIndex+1]){
    			return numIndex +1 ;
    		}
    	}
        return 0 ;
    }
}
