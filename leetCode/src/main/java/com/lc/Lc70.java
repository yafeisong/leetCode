package com.lc;

import java.util.HashMap;
import java.util.Map;

public class Lc70 {
	
	public static void main(String[] args) {
		Lc70 lc = new Lc70() ;
		System.out.println(lc.climbStairs(44));
	}
	
	Map<Integer,Integer> map = new HashMap<Integer, Integer> ();
    public int climbStairs(int n) {
    	if(n==1){
    		return 1;
    	}
    	if(n==2){
    		return 2;
    	}
	     int stairs = (map.get(n-2)==null?climbStairs(n-2):map.get(n-2)) + (map.get(n-1)==null?climbStairs(n-1):map.get(n-1));
	     map.put(n, stairs);
	     return stairs ;
    }
}
