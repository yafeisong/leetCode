package com.lc;

import java.util.Arrays;

public class Lc167 {
	
	public static void main(String[] args) {
		Lc167 lc = new Lc167() ;
		
		int [] numbers =  {2, 3,4};
		System.out.println(Arrays.toString(lc.twoSum(numbers, 6)));
	}
	
    public int[] twoSum(int[] numbers, int target) {
    	int [] ans = new int [2];
    	for(int outter =0 ;outter<=numbers.length-1;outter++){
    		int out = numbers[outter] ;
    		for(int inner = outter+1;inner<=numbers.length-1;inner ++){
    			int inn = numbers[inner] ;
    			if(out + inn == target){
    				ans [0]=outter +1;
    				ans[1]=inner+1;
    			}
    		}
    	}
        return ans;
    }
}
