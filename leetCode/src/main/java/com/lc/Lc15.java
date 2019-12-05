package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lc15 {
//	给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
//
//			注意：答案中不可以包含重复的三元组。
//
//			例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//			满足要求的三元组集合为：
//			[
//			  [-1, 0, 1],
//			  [-1, -1, 2]
//			]
//
	
	public static void main(String[] args) {
//		int [] arr = {-5,14,1,-2,11,11,-10,3,-6,0,3,-4,-9,-13,-8,-7,9,8,-7,11,12,-7,4,-7,-1,-5,13,1,-2,8,-13,0,-1,3,13,-13,-1,10,5,1,-13,-15,12,-7,-13,-11,-7,3,13,1,0,2,1,11,10,8,-8,1,-14,-3,-6,-12,12,0,6,2,2,-9,-3,14,-1,-9,14,-4,-1,8,-8,7,-4,12,-14,3,-9,2,0,-13,-13,-1,3,-12,11,4,-9,8,11,5,-5,-10,3,-1,-11,-13,5,-12,-10,11,11,-3,-5,14,-13,-4,-5,-7,6,2,-13,0,8,-3,4,4,-14,2};
		int [] arr = {-1, 0, 1, 2, -1, -4};
		
		long s = System.currentTimeMillis() ;
		List<List<Integer>> list = threeSum(arr);
		System.out.println(System.currentTimeMillis()-s);
//		
		
	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
    	
    	Arrays.sort(nums);
    	
    	if(nums==null ||nums.length<3){
    		return new ArrayList<List<Integer>>();
    	}
//    	Set<String> set = new HashSet<String>() ;
    	List<List<Integer>> list = new ArrayList<List<Integer>> ();
    	for(int i=0;i<nums.length;i++){
    		for(int j=i+1;j<nums.length;j++){
    			for(int k=j+1;k<nums.length;k++){
    				if(j>nums.length-1 || k>nums.length-1){
    					continue;
    				}
    				int f = nums[i] ;
    				int s = nums[j] ;
    				int t = nums[k];
    				
    				if(f>0){
    					return list ;
    				}
    				if(f+s+t==0){
    					List<Integer> l = new ArrayList<Integer> ();
    					l.add(f);
    					l.add(s);
    					l.add(t);
//    					Collections.sort(l);
//    					String arrString = String.format("%s%s%s", l.get(0),l.get(1),l.get(2)); 
//    					if(!set.contains(arrString)){
//    						list.add(l);
//    						set.add(arrString) ;
//    					}
    					System.out.println(String.format("%s;%s;%s", l.get(0),l.get(1),l.get(2))); 
    					list.add(l);
    				}
    			}
    		}
    	}
    	return list ;
    }
    
    
}
