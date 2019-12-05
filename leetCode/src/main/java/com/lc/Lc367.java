package com.lc;

public class Lc367 {
	
	public static void main(String[] args) {
		
	}
	
    public boolean isPerfectSquare(int num) {
    	int first = Character.getNumericValue(String.valueOf(num).charAt(0));
    	int length = String.valueOf(num).length();
    	int power = 1 ;
    	for(int i =0;i<length/2+1;i++){
    		power *= 10;
    	}
    	int len = (first /2 +1 ) * power;
    	
        for(int i =1;i<=len;i++){
            if (i*i==num){
                return true;
            }
        }
        return false;
    }
}
