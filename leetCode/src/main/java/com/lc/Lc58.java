package com.lc;

public class Lc58 {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));
	}
	
    public static int lengthOfLastWord(String s) {
    	if(s==null||"".equals(s)){
    		s = "";
    	}
    	String [] strs = s.split(" ") ;
    	if(strs.length>0){
    		return strs[strs.length-1].length() ; 
    	}
    	return 0 ;
    }
}
