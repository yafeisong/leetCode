package com.lc;

public class Lc67 {

	public static void main(String[] args) {
		System.out.println(addBinary("1111", "1111") );
	}
    public static String addBinary(String a, String b) {
    
    	int minLength = Math.min(a.length(), b.length());
    	
    	int maxLength = Math.max(a.length(), b.length());
    	
    	if(a.length()<maxLength){
    		for(int index =0;index<maxLength-minLength;index ++){
    			a = "0"+a;
    		}
    	}
    	if(b.length()<maxLength){
    		for(int index =0;index<maxLength-minLength;index ++){
    			b = "0"+b;
    		}
    	}
    	
    	int [] aArr = new int [maxLength];
    	
    	int [] bArr = new int [maxLength];
    	
    	for(int index =0;index <maxLength;index ++){
    		aArr[index] = Integer.valueOf(String.valueOf(a.charAt(index))) ;
    		bArr[index] = Integer.valueOf(String.valueOf(b.charAt(index))) ;
    	}
    	
    	
    	int [] midArr = new int [maxLength];
    	
    	int lastSum = 0 ;
    	for(int index=maxLength-1;index >=0;index --){
    		
    		int curr = aArr[index] + bArr[index] +lastSum  ;
    		
    		lastSum = curr >=2 ?1:0;
    		
    		midArr[index] = curr % 2 ;
    		
    		if(lastSum ==1 && index == 0){
    			int [] extend = new int [midArr.length+1];
    			extend [0]= 1;
    			for(int exIndex =0;exIndex<midArr.length;exIndex ++){
    				extend[exIndex+1] = midArr[exIndex] ;
    			}
    			midArr = extend ;
    		}
    	}
    	StringBuffer sb = new StringBuffer() ;
    	
    	for(int n:midArr){
    		sb.append(n) ;
    	}
    	return sb.toString();
    }

}
