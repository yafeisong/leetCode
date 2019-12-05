package com.lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lc17 {
	
	public static void main(String[] args) {
		List<String> list = letterCombinations2("234");
		System.out.println(list);
	}
	
	static Map<String, String> phone = new HashMap<String, String>() {{
	    put("2", "abc");
	    put("3", "def");
	    put("4", "ghi");
	    put("5", "jkl");
	    put("6", "mno");
	    put("7", "pqrs");
	    put("8", "tuv");
	    put("9", "wxyz");
	  }};

	  static List<String> output = new ArrayList<String>();

	  public static void backtrack(String combination, String next_digits) {
	    // if there is no more digits to check
	    if (next_digits.length() == 0) {
	      // the combination is done
	      output.add(combination);
	    }
	    // if there are still digits to check
	    else {
	      // iterate over all letters which map 
	      // the next available digit
	      String digit = next_digits.substring(0, 1);
	      String letters = phone.get(digit);
	      
	      
	      for (int i = 0; i < letters.length(); i++) {
	        String letter = phone.get(digit).substring(i, i + 1);
	        System.out.println(combination + letter);
	        // append the current letter to the combination
	        // and proceed to the next digits
	        backtrack(combination + letter, next_digits.substring(1));
	      }
	    }
	  }

	  public static List<String> letterCombinations(String digits) {
	    if (digits.length() != 0)
	      backtrack("", digits);
	    return output;
	  }

	
	  public static List<String> letterCombinations2(String digits) {
			LinkedList<String> ans = new LinkedList<String>();
			if(digits.isEmpty()) return ans;
			String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
			ans.add("");
			for(int i =0; i<digits.length();i++){
				int x = Character.getNumericValue(digits.charAt(i));
				while(ans.peek().length()==i){
					String t = ans.remove();
					for(char s : mapping[x].toCharArray())
						ans.add(t+s);
				}
			}
			return ans;
		}
	
//    public static List<String> letterCombinations(String digits) {
//    	
//    	Map<String,String []> map = new HashMap<String, String[]> ();
//    	
//    	String [] string2 = {"a","b","c"};
//    	map.put("2", string2);
//    	String [] string3 = {"d","e","f"};
//    	map.put("3", string3);
//    	String [] string4 = {"g","h","i"};
//    	map.put("4", string4);
//    	String [] string5 = {"j","k","l"};
//    	map.put("5", string5);
//    	String [] string6 = {"m","n","o"};
//    	map.put("6", string6);
//    	String [] string7 = {"p","q","r","s"};
//    	map.put("7", string7);
//    	String [] string8 = {"t","u","v"};
//    	map.put("8", string8);
//    	String [] string9 = {"w","x","y","z"};
//    	map.put("9", string9);
//    	
//    	int [] digestLength = new int [digits.length()];
//    	for(int index =0;index<digits.length();index ++){
//    		digestLength[index] = map.get(String.valueOf(digits.toCharArray()[index])).length;
//    	}
//    	
//    	int [] indexs = new int[digestLength.length];
//    	
//    	List<String> list = new ArrayList<String> ();
//    	
//    	boolean run = true;
//    	while(run){
//    		
//    		StringBuffer sb = new StringBuffer() ;
//    		for(int index =0;index <digits.length();index ++){
//    			String [] arr = map.get(String.valueOf(digits.charAt(index))) ;
//    			int currIndex = indexs[index] ;
//    			
//    			
//    			sb.append(arr[currIndex]) ;
//    			
//    			if(currIndex<digestLength[index]-1){
////    				indexs[index]=currIndex+1;
//    			}else{ // 
//    				for(int ii = index-1;ii>=0;ii--){
//    					int lastIndex = indexs[ii] ;
//    					if(lastIndex<digestLength[ii]-1){ 
//    						indexs[ii] = lastIndex +1 ;
//    						indexs[index]= 0 ;
//    					}
//    				}
//    			}
//    		}
//    		list.add(sb.toString()) ;
//    		System.out.println(sb.toString());
//    		boolean ee = false;
//    		for(int index =0;index<indexs.length;index ++){
//    			if(indexs[index]<digestLength[index]-1){
//    				ee = true;
//    				break;
//    			}
//    		}
//    		run = ee;
//    	}
//        return list ;
//    }


    public List<String> letterCombinations3(String digits) {

    	if (digits == null){
    		return null;
    	}
    	
    	Map<Character,String> map = new HashMap<Character, String> ();
    	
    	map.put('2', "abc");
    	map.put('3', "def");
    	map.put('4', "ghi");
    	map.put('5', "jkl");
    	map.put('6', "mno");
    	map.put('7', "pqrs");
    	map.put('8', "tuv");
    	map.put('9', "wxyz");
    	if (digits.length()<=1){
    		List<String> list = new ArrayList<String> ();
    		String s = map.get(digits.charAt(0) ) ;
    		if (s ==  null ){
    			return list ;
    		}
    		for(Character c :s.toCharArray()){
    			list.add(c.toString());
    		}
    		return list;
    	}
    	
    	List<String> list = new ArrayList<String> ();
    	
    	List<String> res = new ArrayList<String>();
    	
    	for (int index = 0 ;index <digits.length();index ++){
    		Character curr = digits.charAt(index) ;
    		Character next = null ;
    		if (list.size()==0){
    			index ++;
    			
    			next = digits.charAt(index) ;
    			for(Character cc:map.get(curr).toCharArray()){
    				for(Character cn:map.get(next).toCharArray()){
    					list.add(cc.toString()+cn.toString());
    				}
    			}
    			if (index>=digits.length()-1){
    				res.addAll(list) ;
    			}
    		}else{
    			Iterator<String> ite = list.iterator() ;
    			while(ite.hasNext()){
    				String s = ite.next() ;
    				for(Character cc:map.get(curr).toCharArray()){
    					res.add(s+cc.toString());
    				}
    				ite.remove();
    			}
    			if(index<digits.length()-1){
    				list.addAll(res); //
    				res.clear(); 
    			}
    		}
    	}
    	Collections.sort(res);
    	return res;
    }
}
