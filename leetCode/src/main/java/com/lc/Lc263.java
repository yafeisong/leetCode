package com.lc;

public class Lc263 {
	
	public static void main(String[] args) {
		Lc263 lc = new Lc263() ;
		
		System.out.println(lc.isUgly(14));
		
	}
    public boolean isUgly(int num) {
    	if(num ==1){
    		return true;
    	}
    	int ori = num;
    	while(num>0){
    		num = num %2==0?num/2:num;
    		num = num %3==0?num/3:num;
    		num = num %5==0?num/5:num;
    		if(num==ori){
    			return false;
    		}
    		ori = num;
    	}
    	return false;   
    }
}
