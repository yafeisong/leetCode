package com.lc;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class Lc20 {
//	给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//	有效字符串需满足：
//
//	左括号必须用相同类型的右括号闭合。
//	左括号必须以正确的顺序闭合。
//	注意空字符串可被认为是有效字符串。
//
//	示例 1:
//
//	输入: "()"
//	输出: true
//	示例 2:
//
//	输入: "()[]{}"
//	输出: true
//	示例 3:
//
//	输入: "(]"
//	输出: false
//	示例 4:
//
//	输入: "([)]"
//	输出: false
//	示例 5:
//
//	输入: "{[]}"
//	输出: true
//
	
	public static void main(String[] args) {
		Lc20 lc = new Lc20() ;
		System.out.println(lc.isValid("{[]}"));
	}
	
    public boolean isValid(String s) {
    	if("".equals(s) || s == null){
    		return true ;
    	}
    	
    	int indexOf =0;
    	while(indexOf>=0){
    		s = s.replace("()", "")	;
    		s = s.replace("[]", "");
    		s = s.replace("{}", "");

    		int k = s.indexOf("()");
    		int z = s.indexOf("[]");
    		int h = s.indexOf("{}");
    		
    		indexOf = k==-1&&z ==-1 && h ==-1 ?-1:0;
    		
    	}
    	
    	return s.length()==0;
    	
    }
}
