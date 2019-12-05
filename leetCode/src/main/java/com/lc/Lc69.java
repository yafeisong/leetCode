package com.lc;

public class Lc69 {
    
	public static void main(String[] args) {
		Lc69 lc = new Lc69() ;
		
//		System.out.println(lc.mySqrt(2));
		
		System.out.println(Math.sqrt(10));
		
	}
	
	public int mySqrt(int x) {
		
		int ans = -1;
		
		int index = 0;
		while(ans<0){
			index ++ ;
			ans = index * index - x;
			index = ans>0?index-1:index;
		}
		
    	return index ;   
    }
}
