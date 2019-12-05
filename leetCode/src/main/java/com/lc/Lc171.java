package com.lc;

import java.util.HashMap;
import java.util.Map;

public class Lc171 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis() ;
		System.out.println(titleToNumber("zy"));
		System.out.println(System.currentTimeMillis()-start);
	}
    public static int titleToNumber(String s) {
    	s = s.toUpperCase() ;
        int sum = 0 ;
        
        String [] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        int letterIndex = 1;
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(String letter:letters){
        	map.put(letter, letterIndex);
        	letterIndex += 1;
        }
        
        char [] chars = s.toCharArray() ;
        for(int index =0 ;index<chars.length;index ++){
            int curr = map.get(String.valueOf(chars[index]));
            
            sum += Math.pow(26, chars.length-1-index)*curr;
        }
        
        return sum ;
        
    }
}
