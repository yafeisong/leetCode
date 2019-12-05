package com.lc;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class Lc118 {
	
	public static void main(String[] args) {
		Lc118 lc = new Lc118() ;
		List<List<Integer>> all = lc.generate(10) ;
		for(List<Integer> ll :all){
			System.out.println(ll);
		}
	}
	
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> outterList = new ArrayList<List<Integer>> ();
    	for(int index =1;index<=numRows;index++){
    		outterList.add(calcRow(index,outterList)) ;
    	}
    	return outterList ;
    }
    
    public List<Integer> calcRow(int numRow,List<List<Integer>> outterList){
    	List<Integer> currList = new ArrayList<Integer> ();
    	if(numRow==1){
    		currList.add(1);
    		return currList ;
    	}
    	for(int index =0;index<numRow ;index ++){
    		int lastIndexLeft = index -1;
    		int lastIndexRight = index;
    		
    		int currLeft = 0 ;
    		if(lastIndexLeft>=0){
    			currLeft = outterList.get(numRow-1-1).get(lastIndexLeft) ;
    		}
    		int currRight = 0 ;
    		if(lastIndexRight<=numRow-1-1){
    			currRight = outterList.get(numRow-1-1).get(lastIndexRight) ;
    		}
    		currList.add(currLeft + currRight);
    	}
    	return currList;
    }
}
