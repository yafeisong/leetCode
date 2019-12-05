package com.lc;

public class Lc204 {
	
	public static void main(String[] args) {
		Lc204 lc = new Lc204() ;
		System.out.println(lc.countPrimes(10000));
		
//		System.out.println(9980%2);
	}
	
    public int countPrimes(int n) {
    	if (n<=2){
    		return 0 ;
    	}
    	
    	if (n<=3){
    		return 1 ;
    	}
    	
    	if (n<=5){
    		return 2 ;
    	}
    	
    	if (n<=7){
    		return 3 ;
    	}
    	
    	if (n<=10){
    		return 4 ;
    	}
    	
    	if (n ==1){
    		return 0;
    	}
    	int count = 4 ;
    	int index = 12 ;
    	while(index<n){
    		int mod = 0 ;
    		mod = index % 2 ;
    		if(mod == 0 ){
        		index ++ ;
    			continue;
    		}
    		mod = index % 3 ;
    		if(mod == 0  ){
        		index ++ ;
    			continue;
    		}
    		mod = index % 5 ;
    		if(mod == 0 ){
        		index ++ ;
    			continue;
    		}
    		mod = index % 7 ;
    		if(mod == 0  ){
        		index ++ ;
    			continue;
    		}
    		mod = index % 11 ;
    		if(mod == 0  ){
    			index ++ ;
    			continue;
    		}
//    		System.out.println(index);
    		index ++ ;
    		count ++ ;
    	}
     return count ;   
    }
}
