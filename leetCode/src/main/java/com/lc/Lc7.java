package com.lc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lc7 {
	
	public static void main(String[] args) {
		Lc7 lc = new Lc7() ;
		
		long s = System.currentTimeMillis() ;
		int reverse = lc.reverse(1534236469) ;
		System.out.println(System.currentTimeMillis()-s);
		System.out.println(reverse);
	}
	
//	给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
//	示例 1:
//
//	输入: 123
//	输出: 321
//	 示例 2:
//
//	输入: -123
//	输出: -321
//	示例 3:
//
//	输入: 120
//	输出: 21
//	注意:
//
//	假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
	
	
    public int reverse(int x) {
    	if(x>=Integer.MAX_VALUE || x<=0-1-Integer.MAX_VALUE){
    		return 0 ;
    	}
    	
    	String string = "";
    	if(x<0){
    		string = new StringBuffer(String.valueOf(0-x)).reverse().toString();
    	}else{
    		string = new StringBuffer(String.valueOf(x)).reverse().toString();
    	}
    	
    	List<String> list = new ArrayList<String> ();
    	
    	boolean hasNotZero = false;
    	for(char c:string.toCharArray()){
    		String s = String.valueOf(c);
    		if(!"0".equals(s)){
    			hasNotZero = true;
    		}
    		if("0".equals(s) && !hasNotZero){
    			continue;
    		}
    		list.add(s) ;
    	}
    	
    	long reverse = 0 ;
    	
    	Iterator<String> iterator = list.iterator() ;
    	while(iterator.hasNext()){
    		reverse += Integer.valueOf(iterator.next()) * Math.pow(10, list.size()-1);
    		iterator.remove();
    		
    		if(reverse >= Integer.MAX_VALUE){
    			return 0 ;
    		}
    		
    	}
    	if(x<0){
    		reverse = 0-reverse ;
    	}
    	return (int)reverse ;
    }
    public int reverse1(int x) {        
    	int rev = 0;
    	while (x != 0) {
        int pop = x % 10;
        x /= 10;
        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        rev = rev * 10 + pop;
    	}
    	return rev;
    }
}
