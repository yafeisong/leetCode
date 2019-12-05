package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc989 {
//	对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
//
//			给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
//
//			 
//
//			示例 1：
//
//			输入：A = [1,2,0,0], K = 34
//			输出：[1,2,3,4]
//			解释：1200 + 34 = 1234
//			解释 2：
//
//			输入：A = [2,7,4], K = 181
//			输出：[4,5,5]
//			解释：274 + 181 = 455
//			示例 3：
//
//			输入：A = [2,1,5], K = 806
//			输出：[1,0,2,1]
//			解释：215 + 806 = 1021
//			示例 4：
//
//			输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
//			输出：[1,0,0,0,0,0,0,0,0,0,0]
//			解释：9999999999 + 1 = 10000000000
//			 
//
//			提示：
//
//			1 <= A.length <= 10000
//			0 <= A[i] <= 9
//			0 <= K <= 10000
//			如果 A.length > 1，那么 A[0] != 0
//
	
	public static void main(String[] args) {
		int [] a = {2,1,5};
			// {9,9,9,9,9,9,9,9,9,9};
		int k = 806;
		
		addToArrayForm(a, k);
	}
    public static List<Integer> addToArrayForm(int[] A, int K) {
    	
    	
    	boolean run = true;
    	int aIndex = A.length -1 ;
    	int last = 0 ;
    	int Klength = String.valueOf(K).length() ;
    	int maxLength = Math.max(A.length, Klength) ;
    	int [] intToArr = new int [maxLength] ;
    	int tc =  1 ;
    	for (int index =Klength-1;index>=0;index --){
    		if (index>=0){
    			intToArr[maxLength-tc]=Integer.parseInt(String.valueOf(String.valueOf(K).charAt(index))) ;
    			tc ++ ;
    		}else{
    			break;
    		}
    	}
    	int kIndex = intToArr.length -1 ;
    	int [] result = new int [maxLength];
    	int rIndex = maxLength - 1;
    	while(run){
    		int curra = aIndex>=0?A[aIndex]:0 ;
    		int currk = kIndex>=0?intToArr[kIndex]:0 ;
    		
    		int curr = curra + currk +last  ;
    		last = curr >= 10 ?1:0 ;
    		
    		if(rIndex>=0){
    			result[rIndex] = curr %10  ;
    		}
    		
    		
    		if (aIndex <=0 && kIndex <=0){
    			if(last ==1){
    				int [] resultTemp = new int [result.length +1];
    				resultTemp[0]=1 ;
    				
    				for(int tempIndex = 0;tempIndex<result.length;tempIndex++){
    					resultTemp[tempIndex+1] = result[tempIndex];
    				}
    				result = resultTemp ;
    			}
    			break;
    		}
    		
    		aIndex -- ;
    		kIndex -- ;
    		
    		rIndex -- ;
    		
    	}
    	
    	List<Integer> list = new ArrayList<Integer> ();
    	for(int resultIndex =0;resultIndex<result.length;resultIndex ++){
    		list.add(result[resultIndex]) ;
    	}
    	
    	return list ;
    }
}
