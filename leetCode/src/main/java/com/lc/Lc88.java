package com.lc;

import java.util.Arrays;

public class Lc88 {
	
	public static void main(String[] args) {
		Lc88 lc = new Lc88() ;
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		int m = 3,n = 3;
		lc.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
    	Arrays.sort(nums1);
    	
    	for(int index =0;index<n;index++){
    		for(int ii = 0;ii<nums1.length;ii++){
    			if(nums1[ii]==0){
    				nums1[ii] = nums2[index];
    				break;
    			}
    		}
    	}
    	Arrays.sort(nums1);
    	
    }
}
