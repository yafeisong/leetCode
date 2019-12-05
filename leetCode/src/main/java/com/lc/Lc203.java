package com.lc;

public class Lc203 {
	
	public static void main(String[] args) {
		Lc203 lc  = new Lc203() ;
		
//		1->2->6->3->4->5->6
		
		ListNode ln = new ListNode(1);
		ListNode root = ln ;
		ln.next = new ListNode(1);
		ln = ln.next ;
		ln.next = new ListNode(2);
		ln = ln.next ;
		ln.next = new ListNode(6);
		ln = ln.next ;
		ln.next = new ListNode(3);
		ln = ln.next ;
		ln.next = new ListNode(4);
		ln = ln.next ;
		ln.next = new ListNode(5);
		ln = ln.next ;
		ln.next = new ListNode(6);
		
		
		ListNode res = lc.removeElements(root, 6);
		
		while(res != null){
			System.out.println(res.val);
			res = res.next ;
		}
		
	}
	
    public ListNode removeElements(ListNode head, int val) {
    	ListNode root = head;
    	if(head == null){
    		return null;
    	}
    	if(head.next == null && head.val == val){
    		return null;
    	}
    	ListNode last = null;
    	while(head != null){
    		while(head.val == val){
    			head = head.next ;
    			root = head;
    			if(root == null){
    				return null ;
    			}
    		}
    		last = head ;
    		head = head.next ;
    		while( head != null && head.val == val){
    			head = head.next ;
    		}
    		last.next = head;
    		last = head ;
    		if(head == null){
    			return root;
    		}
    	}
    	return root;
    }
}
