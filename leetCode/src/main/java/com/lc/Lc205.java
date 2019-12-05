package com.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lc205 {
	
	public static void main(String[] args) {
		Lc205 lc = new Lc205() ;
		
		System.out.println(lc.isIsomorphic("a", "a"));
		
	}
	
    public boolean isIsomorphic(String s, String t) {
    	
    	if(s == null && t == null ){
    		return true;
    	}
    	if(s == null || t == null){
    		return false;
    	}
    	if (s.equals(t) && s.equals("")){
    		return true;
    	}
    	
    	Set<Character> sSet = new HashSet<Character> ();
    	for(char c :s.toCharArray()){
    		sSet.add(c);
    	}
    	Set<Character> tSet = new HashSet<Character> ();
    	
    	for(char c:t.toCharArray()){
    		tSet.add(c);
    	}
    	
    	if(sSet.size() != tSet.size()){
    		return false;
    	}
    	
    	
    	
    	Map<Character,List<Integer>> indexMap = new HashMap<>();
    	for(int charIndex = 0 ;charIndex<s.length();charIndex ++){
    		char c = s.charAt(charIndex) ;
    		List<Integer> index = indexMap.get(c);
    		if(index == null){
    			index = new ArrayList<Integer> ();
    			indexMap.put(c, index);
    		}
    		index.add(charIndex);
    	}
//    	boolean hasRepetLetters = false;
    	for(char c:s.toCharArray()){
    		List<Integer> list = indexMap.get(c);
    		if(list != null && list.size()>1){
    			char f = t.charAt(list.get(0));
    			Iterator<Integer> iterator = list.iterator() ;
    			while(iterator.hasNext()){
    				int index = iterator.next() ;
    				if(!Character.valueOf(t.charAt(index)).equals(Character.valueOf(f))){
    					return false;
    				}
    			}
//    			hasRepetLetters = true;
    		}
    	}
    	
    	return true;
    }
}
