package com.lc;

import java.awt.PageAttributes.OriginType;
import java.util.ArrayList;
import java.util.List;

public class Lc28 {
//	实现 strStr() 函数。
//
//	给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
//
//	示例 1:
//
//	输入: haystack = "hello", needle = "ll"
//	输出: 2
//	示例 2:
//
//	输入: haystack = "aaaaa", needle = "bba"
//	输出: -1
//	说明:
//
//	当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
//	对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
//
//	来源：力扣（LeetCode）
//	链接：https://leetcode-cn.com/problems/implement-strstr
//	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	
	
	
	public static void main(String[] args) {
//		String str = "";
		
		for(int i =0;i<1000;i++){
			String ori = "";
			String target = "";
			
			int index = strStr(ori,target);
			
			int oriIndex = ori.indexOf(target) ;
			
			if(index != oriIndex){
				System.out.println(String.format("ori[%s] target[%s] result not same,index =[%s],oriIndex=[%s]", ori,target,index,oriIndex));
			}
		}
		
	}
	
    public static int strStr(String haystack, String needle) {
    	
//    	haystack.indexOf(needle);
//    	
    	if(needle == null || "".equals(needle)){
    		return 0 ;
    	}
    	String pre = String.valueOf(needle.charAt(0)) ;
    	
    	List<Integer> indexs = new ArrayList<Integer> (); // 所有和needle第一个字符相同的索引位置
    	for(int index = 0 ;index<haystack.toCharArray().length;index ++){
    		char c = haystack.toCharArray()[index];
    		String s = String.valueOf(c) ;
    		if(s.equals(pre)){
    			indexs.add(index) ;
    		}
    	}
    	
    	if(indexs.size()==0){
    		return -1 ;
    	}
    	
    	for(int index :indexs){
    		int endIndex = index + needle.length() ;
    		if(endIndex>haystack.length()){  
    			return -1 ;
    		}
    		if(haystack.substring(index,endIndex).equals(needle)){
    			return index ;
    		}
    		
    	}
    	return -1 ;
    	
//        public int indexOf(String str) {
//            return indexOf(str, 0);
//        }
//
//        public int indexOf(String str, int fromIndex) {
//            return indexOf(value, 0, value.length,
//                    str.value, 0, str.value.length, fromIndex);
//        }
//
//        static int indexOf(char[] source, int sourceOffset, int sourceCount,
//                String target, int fromIndex) {
//            return indexOf(source, sourceOffset, sourceCount,
//                           target.value, 0, target.value.length,
//                           fromIndex);
//        }
    	
//        static int indexOf(char[] source, int sourceOffset, int sourceCount,
//                char[] target, int targetOffset, int targetCount,
//                int fromIndex) {
//    	
    	
//    	int fromIndex = 0 ;
//    	
//    	char [] source = haystack.toCharArray() ;
//    	
//    	int sourceOffset = 0 ;
//    	
//    	int sourceCount = haystack.length() ;
//    	
//    	int targetCount = needle.length() ;
//    	
//    	int targetOffset = 0 ;
//    	
//    	char [] target = needle.toCharArray() ;
//    	
//    	
//    	
//        if (fromIndex >= sourceCount) {
//            return (targetCount == 0 ? sourceCount : -1);
//        }
//        if (fromIndex < 0) {
//            fromIndex = 0;
//        }
//        if (targetCount == 0) {
//            return fromIndex;
//        }
//
//        char first = target[targetOffset];
//        int max = sourceOffset + (sourceCount - targetCount);
//
//        for (int i = sourceOffset + fromIndex; i <= max; i++) {
//            /* Look for first character. */
//            if (source[i] != first) {
//                while (++i <= max && source[i] != first);
//            }
//
//            /* Found first character, now look at the rest of v2 */
//            if (i <= max) {
//                int j = i + 1;
//                int end = j + targetCount - 1;
//                for (int k = targetOffset + 1; j < end && source[j]
//                        == target[k]; j++, k++);
//
//                if (j == end) {
//                    /* Found whole string. */
//                    return i - sourceOffset;
//                }
//            }
//        }
//        return -1;
    	
    	
    	
    	
    }
	

}
