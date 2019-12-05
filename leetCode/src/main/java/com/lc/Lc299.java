package com.lc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Lc299 {
	
	public static void main(String[] args) {
		Lc299 lc = new Lc299() ;
		System.out.println(lc.getHint("1122", "2211"));
	}
	
    public String getHint(String secret, String guess) {
    	Map<Character,Integer> secMap = new HashMap<Character, Integer> ();
    	Map<Character,Integer> gueMap = new HashMap<Character, Integer> ();
    	int len = secret.length() ;
    	int ANum = 0 ;
    	int BNum = 0 ;
    	for(int index = 0 ;index < len ;index ++){
    		if(String.valueOf(secret.charAt(index)).equals(String.valueOf(guess.charAt(index)))){
    			ANum ++ ;
    		}else{
    			Integer secNum = secMap.get(secret.charAt(index))==null?1:secMap.get(secret.charAt(index))+1 ;
    			Integer gueNum = gueMap.get(guess.charAt(index)) == null ?1:gueMap.get(guess.charAt(index)) +1 ;
    			
    			secMap.put(secret.charAt(index), secNum) ;
    			
    			gueMap.put(guess.charAt(index), gueNum);
    		}
    	}
    	for(int index = 0 ;index < len ;index ++){
    		if(!String.valueOf(secret.charAt(index)).equals(String.valueOf(guess.charAt(index)))){
    			Integer secNum = secMap.get(secret.charAt(index))==null?0:secMap.get(secret.charAt(index)) ;
    			Integer gueNum = gueMap.get(secret.charAt(index)) == null ?0:gueMap.get(secret.charAt(index)) ;
    			
    			BNum += Math.min(secNum, gueNum) ;
    			
    			secNum = secNum >0?secNum-1:0;
    			gueNum = gueNum >0?gueNum-1:0;
    			
    			secMap.remove(secret.charAt(index));
    			
    			gueMap.remove(secret.charAt(index)) ;
    			
    			
    		}
    	}
    	return String.format("%sA%sB", ANum,BNum);
    }
}
