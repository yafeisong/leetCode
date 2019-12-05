package com.lc;

public class Lc21 {
//	输入：1->2->4, 1->3->4
//	输出：1->1->2->3->4->4
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		System.out.println(l1);
		
		System.out.println(l2);
		
		Lc21 lc = new Lc21() ;
		ListNode node = lc.mergeTwoLists(l1, l2) ;
		while (node != null){
			System.out.println(node.val);
			node = node.next ;
		}
		
	}
	
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	ListNode root = null ;
    	
    	ListNode p = null;
    	
    	while(l1 != null || l2 !=null){
    		int min = 0;
    		int currL1Val = 0 ;
    		if(l1 == null){
    			currL1Val = Integer.MAX_VALUE ;
    		}else{
    			currL1Val = l1.val ;
    		}
    		int currL2Val = 0 ;
    		if(l2 == null){
    			currL2Val = Integer.MAX_VALUE ;
    		}else{
    			currL2Val = l2.val ;
    		}
    		
    		min = Math.min(currL1Val, currL2Val);
    		
    		boolean isValSame = currL1Val == currL2Val?true:false;
    		
    		if(root == null){
    			p = new ListNode (min);
    			root = p;
    			if(isValSame){
    				p.next = new ListNode (min);
    				p = p.next ;
    			}
    		}else{
    			p.next = new ListNode (min);
    			p = p.next ;
    			if(isValSame){
    				p.next = new ListNode (min);
    				p = p.next ;
    			}
    		}
    		if(currL1Val<currL2Val){
    			l1 = l1.next ;
    		}
    		if (currL2Val < currL1Val){
    			l2 = l2.next ;
    		}
    		if(currL1Val == currL2Val){
    			l1 = l1.next ;
    			l2 = l2.next ;
    		}
    		
    	}
        return root;
    }

}
