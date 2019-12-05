package com.lc;

import java.time.chrono.MinguoChronology;

public class Lc14 {
//	输入: ["flower","flow","flight"]
//			输出: "fl"
//			示例 2:
//
//			输入: ["dog","racecar","car"]
//			输出: ""
//			解释: 输入不存在公共前缀。
	
	
//
	
	public static void main(String[] args) {
		String [] s = {"c","c"}; 
		System.out.println(longestCommonPrefix(s));
	}
    public static String longestCommonPrefix(String[] strs) {
    	
    	if(strs == null || strs.length==0){
    		return "";
    	}
    	
    	if(strs.length==1){
    		return strs[0] ;
    	}
    	
    	int minLength = Integer.MAX_VALUE ;
    	String minLengthString = "";
    	for(String s :strs){
    		if(s.length()<minLength){
    			minLength = s.length() ;
    			minLengthString = s;
    		}
    	}
    	
    	String pre = "";
    	for(int pre_index = 0 ;pre_index<=minLength ;pre_index++){
    		String p = minLengthString.substring(0,pre_index) ;
    		boolean allStartWith = true;
    		for(String s:strs){
    			if(!s.startsWith(p)){
    				allStartWith = false;
    			}
    		}
    		if(allStartWith){
    			pre = p;
    		}
    	}
    	
    	return pre ;
    }
	
}
