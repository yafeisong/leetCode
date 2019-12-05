package com.lc;

import java.util.HashMap;
import java.util.Map;

public class Lc389 {
    public char findTheDifference(String s, String t) {
    	Map<Character,Integer> smap = new HashMap<Character, Integer> ();
    	Map<Character,Integer> tmap = new HashMap<Character, Integer> ();
    	
    	for(char c :s.toCharArray()){
    		Integer i = smap.get(c);
    		i = i == null?1:i+1;
    		smap.put(c, i);
    	}
    	for(char c :t.toCharArray()){
    		Integer i = tmap.get(c);
    		i = i == null?1:i+1;
    		smap.put(c, i);
    	}
    	
    	for(char c:tmap.keySet()){
    		if (smap.get(c) != tmap.get(c)){
    			return c;
    		}
    	}
    	
    	return '0';
    }
}
