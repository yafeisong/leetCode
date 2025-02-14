package com.lc;


public class Lc125 {
//	给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
//	说明：本题中，我们将空字符串定义为有效的回文串。
//
//	示例 1:
//
//	输入: "A man, a plan, a canal: Panama"
//	输出: true
//	示例 2:
//
//	输入: "race a car"
//	输出: false
	
	public static void main(String[] args) {
//		isPalindrome("A man, a plan, a canal: Panama");
//		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("0P"));
	}
	
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for(char c :s.toCharArray()){
        	if((c>='0' && c<='9')||(c >='A' && c<='Z') || (c>='a' && c<='z')){
        		sb.append(c);
        	}
        }
        String string = sb.toString() ;
        String reverse = sb.reverse().toString() ;
    	return reverse.equalsIgnoreCase(string);
    }
}
