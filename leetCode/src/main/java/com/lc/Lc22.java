package com.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lc22 {
	
	public static void main(String[] args) {
		Lc22 lc = new Lc22() ;
		
		lc.generateParenthesis(10);
	}
	
    public List<String> generateParenthesis(int n) {
    	Map<Integer,List<String>> map = new HashMap<Integer, List<String>> ();
    	List<String> parenthesis = new ArrayList<String> ();
    	parenthesis.add("()");
    	map.put(1, parenthesis) ;
    	for(int index = 2;index <=n; index ++){
    		List<String> list = map.get(index-1) ;
    		if(list !=null){
        		Iterator<String> subList = list.iterator() ;
        		Set<String> set = new HashSet<String> ();
        		while(subList.hasNext()){
        			String ss = subList.next() ;
        			for(int insertIndex = 0 ;insertIndex<ss.length();insertIndex ++){
        				String pre = ss.substring(0,insertIndex);
        				String suf = ss.substring(insertIndex) ;
        				set.add(pre + "()" + suf) ;
        			}
        		}
        		
        		List<String> sList = new ArrayList<String> ();
        		for(String s:set){
        			sList.add(s);
        		}
        		map.put(index, sList) ;
    		}
    	}
        return map.get(n) ;
    }
    
    
//    public void generateParenthesis2(Map<Integer,List<String>> map ,int n) {
//    	List<String> last = map.get(n-1) ;
//    	if(last != null){
//    		Iterator<String> list = last.iterator() ;
//    		Set<String> set = new HashSet<String> ();
//    		while(list.hasNext()){
//    			String ss = list.next() ;
//    			for(int insertIndex = 0 ;insertIndex<ss.length();insertIndex ++){
//    				String pre = ss.substring(0,insertIndex);
//    				String suf = ss.substring(insertIndex) ;
//    				set.add(pre + "()" + suf) ;
//    			}
//    		}
//    		
//    		List<String> subList = new ArrayList<String> ();
//    		for(String s:set){
//    			subList.add(s);
//    		}
//    		map.put(n, subList) ;
//    	}else{
//    		generateParenthesis2(map, n-1);
//    	}
////    	return map.get(n) ;
//    }
}
