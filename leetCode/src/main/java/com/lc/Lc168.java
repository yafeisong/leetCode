package com.lc;

public class Lc168 {
	public static void main(String[] args) {
//		char c = 'Z';
//		int a = (int)c;
//		System.out.println(a);
		
//		System.out.println(2600%26);
		
		System.out.println(convertToTitle(52));
	}
    public static String convertToTitle(int n) {
    	String res = "ZABCDEFGHIJKLMNOPQRSTUVWXY";
    	StringBuffer sb = new StringBuffer() ;
    	while(n>0){
    		if(n<26){
    			sb.append(res.charAt(n));
    			break;
    		}
    		int mod = n % 26 ;
    		sb.append(res.charAt(mod));
    		n = mod>0?(n-mod)/26:(n-1)/26;
    	}
    	return sb.reverse().toString();
    }
}
