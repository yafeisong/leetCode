package com.lc;

import java.util.ArrayList;
import java.util.List;

public class Lc202 {
	
	public static void main(String[] args) {
		Lc202 lc = new Lc202() ;
		System.out.println(lc.isHappy(54));
	}
	
    public boolean isHappy(int n) {
    	
    	if (n==1) return true;
    	
    	List<Integer> list = new ArrayList<Integer> ();
    	
    	while(n!=1){
    		int res = 0;
    		for(char c :String.valueOf(n).toCharArray()){
    			res += Math.pow(Character.getNumericValue(c),2);
    		}
    		if(list.contains(res)){
    			return false;
    		}
    		list.add(res);
    		if(res ==1){
    			return true;
    		}
    		n = res;
    	}
    	return false;   
    }
}
