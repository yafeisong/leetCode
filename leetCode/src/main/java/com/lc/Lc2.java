package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc2 {
	
//	给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
//	如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//	您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//	示例：
//
//	输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//	输出：7 -> 0 -> 8
//	原因：342 + 465 = 807
//
//	来源：力扣（LeetCode）
//	链接：https://leetcode-cn.com/problems/add-two-numbers
//	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	
	
	public static void main(String[] args) {
//		Lc2 lc = new Lc2() ;
//		
//		lc.addTwoNumbers(null, null);
		
		
		ListNode l1 = new Lc2().new ListNode (1);
		
		ListNode l1Next0 = new Lc2().new ListNode(8) ;
		
		l1.next = l1Next0 ;
		
		ListNode l2 = new Lc2().new ListNode (0);
		
		
		Lc2 lc = new Lc2 ();
		ListNode ln = lc.addTwoNumbers(l1, l2) ;
		
		System.out.println("===============");
		System.out.println(ln);
		
		
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	int arrLength = 1 ;
    	ListNode iterator = l1.next ;
    	while(iterator!=null){
    		arrLength ++ ;
    		iterator = iterator.next ;
    	}
    	
    	int length1 = arrLength ;
    	
    	arrLength = 1 ;
    	iterator = l2.next ;
    	while(iterator!=null){
    		arrLength ++ ;
    		iterator = iterator.next ;
    	}
    	
    	int length2= arrLength ;
    	
    	int length = length1>length2?length1:length2;
    	
    	int [] l1Arr = new int [length];
    	int [] l2Arr = new int [length];
    	
    	
    	l1Arr [0]=l1.val ;
    	l2Arr [0]=l2.val ;
    	
    	ListNode listNode1Next = l1.next  ;
    	
    	ListNode listNode2Next = l2.next  ;
    	
    	int index = 1;
    	while(listNode1Next !=null || listNode2Next!=null){
    		l1Arr [index ]= listNode1Next!=null?listNode1Next.val:0; ;
    		l2Arr [index] = listNode2Next!=null?listNode2Next.val:0 ;
    		index ++ ;
    		listNode1Next = listNode1Next!=null?listNode1Next.next:null ;
    		
    		listNode2Next = listNode2Next!=null?listNode2Next.next:null ;
    	}
    	
    	int sum = 0 ;
    	for(int i = l1Arr.length-1;i>=0;i--){
    		int l1ArrEle = l1Arr[i];
    		
    		int l2ArrEle = l2Arr[i];
    		for(int j=0;j<i;j++){
    			l1ArrEle = l1ArrEle * 10 ;
    			l2ArrEle = l2ArrEle * 10 ;
    		}
    		sum += l1ArrEle + l2ArrEle ;
    		
    	}
    	
    	char [] chs = String.valueOf(sum).toCharArray() ;
    	
    	int [] re = new int [chs.length] ;
    	for(int i = chs.length-1;i>=0;i--){
    		char ch = chs[i];
    		re[chs.length-1-i]=Integer.valueOf(String.valueOf(ch)) ;
    	}
    	
    	ListNode resultListNode = new ListNode(re[0]);
    	
    	
    	ListNode nextNode = resultListNode ;
    	
    	int resultIndex = 1;
    	while(resultIndex<=re.length-1){
    		ListNode ll = new ListNode(re[resultIndex]) ;
    		
    		nextNode.next = ll ;
    		
    		nextNode = ll ;
    		resultIndex ++ ;
    	}
    	
    	return resultListNode ;
    }
    
    public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	    
	    
	    @Override
	    public String toString() {
	    	StringBuffer sb = new StringBuffer("val=").append(this.val) ;
	    	ListNode alIterator = this.next ;
	    	while(alIterator!=null){
	    		sb.append(",nextVal=").append(alIterator.val);
	    		alIterator = alIterator.next ;
	    	}
	    	
	    	return sb.toString() ;
	    
	    }
     }
    
    
    
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;
            
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        return root.next;
    }
}
