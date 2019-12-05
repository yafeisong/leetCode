package com.lc;

public class Lc66 {
	
	public static void main(String[] args) {
		int [] dis = {8,9,9,9};
		System.out.println(plusOne(dis));
	}
	
    public static int[] plusOne(int[] digits) {
    	
//    	int result = 0 ;
//    	
//    	for(int index = 0 ;index<digits.length;index++){
//    		result += Math.pow(10, digits.length-1-index)*digits[index];
//    	}
//    	result += 1;
//    	
//    	int [] resultArrs = new int [String.valueOf(result).length()];
//    	
//    	for(int index = 0;index<resultArrs.length;index ++){
//    		resultArrs[index]=Integer.parseInt(String.valueOf(String.valueOf(result).charAt(index)));
//    	}
//    	return resultArrs ;
    	
    	if(digits[digits.length-1]<9){
    		digits[digits.length-1] = digits[digits.length-1] +1;
    		return digits ;
    	}
    	
    	int index = digits.length-1;
    	while(index>=0){
    		int curr = digits[index]+1;
    		if(curr>9){
    			digits[index]= 0 ;
    			index -- ;
    			continue ;
    		}
    		digits[index] = curr ;
    		return digits ;
    	}
    	
    	int [] returnArr = new int [digits.length+1];
    	
    	returnArr[0]=1;
    	for(int arrIndex = 1;arrIndex<returnArr.length;arrIndex ++){
    		returnArr[arrIndex]=0;
    	}
    	return returnArr ;
    }

}
