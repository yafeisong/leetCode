package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lc448 {
	

	public static void main(String[] args) {
		
		Lc448 lc = new Lc448() ;
		
		int [] nums = {10,2,5,10,9,1,1,4,3,7};
		
		List<Integer> ans = lc.findDisappearedNumbers(nums);
		
		Iterator<Integer> ite = ans.iterator() ;
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}
	
	
	
	
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer> ();
        Arrays.sort(nums);
        for(int index = 0 ;index<nums.length;index ++){
        	int currIndex = 0 ;
        	if(nums[index] == index +1){
        		continue;
        	}else {
        		currIndex = index ;
        		index = 0 ;
        	}
        	while(nums[index] != currIndex +1){
        		index ++ ;
        		if (index>nums.length-1){
        			ans.add(currIndex+1);
        			break;
        		}
        	}
        	index = currIndex ;
        }
        return ans;
    }
}
