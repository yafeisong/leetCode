package com.lc;

public class Lc415 {
	
//	给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
//
//	注意：
//
//	num1 和num2 的长度都小于 5100.
//	num1 和num2 都只包含数字 0-9.
//	num1 和num2 都不包含任何前导零。
//	你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
	
	public static void main(String[] args) {
		System.out.println(addStrings("1", "9"));
	}
	
	
    public static String addStrings(String num1, String num2) {
    	int maxLength = Math.max(num1.length(), num2.length()) ;

    	int [] num1Arr = new int [maxLength] ;
    	int [] num2Arr = new int [maxLength] ;
    	
    	for(int index =maxLength-1;index>=0;index --){
    		if(num1.length()>(maxLength-index-1)){
    			num1Arr[index]=Integer.valueOf(String.valueOf(num1.charAt((num1.length()-1-(maxLength-1-index))))) ;
    		}
    		if(num2.length()>(maxLength-index-1)){
    			num2Arr[index]=Integer.valueOf(String.valueOf(num2.charAt((num2.length()-1-(maxLength-1-index))))) ;
    		}
    	}

    	int index = maxLength -1 ;
    	int [] result = new int [maxLength];
    	int last = 0 ;
    	while(index>=0){
    		int currNum1 = num1Arr[index] ;
    		int currNum2 = num2Arr[index] ;
    		int curr = currNum1 + currNum2 + last ;
    		
    		last = curr >=10?1:0;
    		if(index >=0){
    			result[index]=curr %10;
    		}
    		
    		if(index <=0 ){
    			if(last == 1 ){
    				int [] resultTemp = new int[maxLength+1];
    				
    				resultTemp[0]=1 ;
    				
    				for(int tempIndex = 0 ;tempIndex<maxLength;tempIndex++){
    					resultTemp[tempIndex+1]=result[tempIndex];
    				}
    				result = resultTemp	;
    			}
    		}
    		index -- ;
    	}
    	
    	StringBuffer sb  = new StringBuffer() ;
    	for(int x:result){
    		sb.append(x) ;
    	}
        return sb.toString() ;
    }
}
