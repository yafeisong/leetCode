package com.lc;

public class Lc172 {
	
	public static void main(String[] args) {
		System.out.println(trailingZeroes(1808548329));
	}
	
    public static int trailingZeroes(int n) {
        int countEndWithFive = 0 ;
//        for(int i = n;i>=1;i--){
//        	int j = i;
//        	while(j%5==0){
//        		j = j/5 ;
//        		countEndWithFive ++ ;
//        	}
//        }
        
        
        while(n>=5){
        	countEndWithFive += n/5;
        	n = n/5;
        }
    	return countEndWithFive;
    }
}
