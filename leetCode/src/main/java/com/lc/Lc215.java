package com.lc;

import java.util.ArrayList;
import java.util.List;

public class Lc215 {
    public int findKthLargest(int[] nums, int k) {
    	
    	List<Integer> list = new ArrayList<Integer>();
    	int listMin = Integer.MAX_VALUE ;
    	for(int num:nums){
    		if(list.size()<k){
    			list.add(num);
    		}
    		if (num>listMin){
    			listMin = Math.min(listMin, num);
    		}
    	}
    	return 0 ;
    }
}
