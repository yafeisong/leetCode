package com.lc;

import java.util.HashMap;
import java.util.Map;

public class Lc169 {
//	给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
//	你可以假设数组是非空的，并且给定的数组总是存在众数。
//
//	示例 1:
//
//	输入: [3,2,3]
//	输出: 3
//	示例 2:
//
//	输入: [2,2,1,1,1,2,2]
//	输出: 2
	
	
	public static void main(String[] args) {
		int [] nums = {2, 2, 1, 1, 1, 2, 2, 3, 2};
		System.out.println(majorityElement(nums));
	}
	
    public static int majorityElement(int[] nums) {
    	Map<Integer,Integer> mapCount = new HashMap<Integer, Integer> ();
    	
    	for(int num:nums){
    		Integer count = mapCount.get(num);
    		count = count==null?1:count+1;
    		if(count>nums.length/2){
    			return num;
    		}
    		mapCount.put(num, count);
    	}
    	return -1 ;
    }

}
