package com.lc;

public class Lc9 {
	
//	示例 1:
//
//		输入: 121
//		输出: true
//		示例 2:
//
//		输入: -121
//		输出: false
//		解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//		示例 3:
//
//		输入: 10
//		输出: false
//		解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
	
	public static void main(String[] args) {
		isPalindrome(123454321);
		
		
	}
	
    public static  boolean isPalindrome(int x) {
    	
    	if(x<0){
    		return false;
    	}
    	if(x>0 && x<10){
    		return true;
    	}
    	String s = String.valueOf(x) ;
    	
    	int length = s.length() ;
    	
    	System.out.println(length);
    	
    	String p = s.substring(0,length/2) ;
    	String su = s.substring(length%2==0?length/2:length/2+1, s.length());
    	
    	System.out.println(p);
    	System.out.println(su);
    	
    	
    	su = new StringBuffer(su).reverse().toString();
    	
    	return p.equals(su) ;
    }

}
