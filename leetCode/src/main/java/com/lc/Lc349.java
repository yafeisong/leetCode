package com.lc;

import java.util.HashSet;
import java.util.Set;

public class Lc349 {
	public static void main(String[] args) {
		
	}
	
    public int[] intersection(int[] nums1, int[] nums2) {
    
    	if(nums1==null || nums2==null){
    		return null;
    	}
    	boolean oneLessThanTwo = nums1.length<nums2.length?true:false;
    	
    	Set<Integer> set = new HashSet<Integer> ();
    	if(oneLessThanTwo){
    		for(int oneIndex =0;oneIndex<nums1.length;oneIndex ++){
    			int one = nums1[oneIndex];
    			for(int secIndex =0;secIndex<nums2.length;secIndex ++){
    				if(one == nums2[secIndex]){
    					set.add(one);
    				}
    			}
    		}
    	}else{
    			for(int secIndex =0;secIndex<nums2.length;secIndex ++){
    				int sec = nums2[secIndex];
    				for(int oneIndex =0;oneIndex<nums1.length;oneIndex ++){
    				if(sec == nums1[oneIndex]){
    					set.add(sec);
    				}
    			}
    		}
    	}
    	
    	int [] ans = new int [set.size()];
    	int index = 0;
    	for(int an :set){
    		ans[index]=an;
    		index ++;
    	}
    	
    	return ans;
    }
}
