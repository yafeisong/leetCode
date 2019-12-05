package com.lc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//Definition for singly-linked list.
public class Lc160 {
	
	
	
	public static void main(String[] args) {
//		Lc160 lc = new Lc160() ;
//		
//		ListNode roota = new ListNode(8) ;
//		
//		ListNode rootb = new ListNode(4) ;
//		
//		ListNode ln1 = new ListNode(1) ;
//		
//		ListNode ln2 = new ListNode(8);
//		
//		ListNode ln3 = new ListNode(4);
//		
//		ListNode ln4 = new ListNode(5) ;
//		
//		ln3.next = ln4;
//		ln2.next = ln3;
//		ln1.next = ln2;
//		rootb.next = ln1;
//		
//		ListNode returnNode = lc.getIntersectionNode(roota, rootb);
//		
//		System.out.println(returnNode);
//		
//		
		
		Map<String,String> map = new HashMap<>(16);
		
		
		
	}
	

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	
    	ListNode roota = headA ;
    	ListNode rootb = headB ;
    	
    	LinkedList<ListNode> listA = new LinkedList<ListNode>();
    	LinkedList<ListNode> listB = new LinkedList<ListNode>();
    	
    	while(roota!=null || rootb !=null){
    		if(roota != null){
    			listA.add(roota) ;
    			roota = roota.next ;
    		}
    		if(rootb != null){
    			listB.add(rootb) ;
    			rootb = rootb.next ;
    		}
    	}
    	boolean same = true;
    	ListNode sameNode = null;
    	while(same){
    		ListNode peeka = null ;
    		ListNode peekb = null;
    		try {
				peeka = listA.removeLast() ;
			} catch (Exception e) {

			}
    		try {
				peekb = listB.removeLast() ;
			} catch (Exception e) {

			}
    		if(peeka == null || peekb == null){
    			return sameNode ;
    		}
    		if (peeka.val != peekb.val){
    			same = false;
    			return sameNode ;
    		}
    		sameNode = peeka ;
    	}
        return null;
    }

}
