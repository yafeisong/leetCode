package com.lc;

public class Lc191 {
	
	public static void main(String[] args) {
		Lc191 lc = new Lc191() ;
		System.out.println(lc.hammingWeight(0000000000000000000000000000000000000000000000000001011));
	}
	 public int hammingWeight(int n) {
		 
		 String s = Integer.toBinaryString(n);
		 
		 int ans = 0 ;
		 
		 for(char c :s.toCharArray()){
			 if(Character.getNumericValue(c)==1){
				 ans +=1;
			 }
		 }
		 
		 
		 return ans ;
	 }
}
