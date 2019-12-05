package com.lc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lc206 {
	
	public static void main(String[] args) {
		Lc206 lc = new Lc206() ;
		ListNode ln = new ListNode(1);
		ListNode root = ln ;
		root.next = new ListNode(2);
		root = root.next ;
		
		root.next = new ListNode(3);
		root = root.next ;
		
		root.next = new ListNode(4);
		root = root.next ;
		
		root.next = new ListNode(5);
		
//		while(ln!=null){
//			System.out.println(ln.val);
//			ln = ln.next ;
//		}
		
		System.out.println("==================");
		
		ListNode res = lc.reverseList(ln);
		
		while(res!=null){
			System.out.println(res.val);
			res = res.next ;
		}
		
		
	}

    public ListNode reverseList(ListNode head) {
    	if(head == null){
    		return null;
    	}
    	
    	List<ListNode> nodes = new ArrayList<ListNode> ();
    	
    	while(head != null){
    		nodes.add(head);
    		head = head.next ;
    	}
    	head = nodes.get(nodes.size()-1);
    	ListNode next = head;
    	for(int index = nodes.size()-2;index >=0;index --){
    		ListNode n = nodes.get(index) ;
    		n.next = null;
    		next.next = n ;
    		next = next.next ;
    	}
        return head;
    }
}
