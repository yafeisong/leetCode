package com.lc;

public class Lc198 {
	
	public static void main(String[] args) {
		Lc198 lc = new Lc198() ;
		int [] nums = {2,7,9,3,1};
		System.out.println(lc.rob(nums));
	}
	
    public int rob(int[] nums) {
    	int sum = 0 ;
    	for(int index =0;index <nums.length;index++){
    		if(index+1 <nums.length){
    			sum += Math.max(nums[index], nums[index+1]);
    			index +=1 ;
    		}else{
    			sum += nums[nums.length-1];
    		}
    	}
    	return sum ;
    }

}
