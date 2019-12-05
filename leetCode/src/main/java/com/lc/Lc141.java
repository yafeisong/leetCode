package com.lc;

import java.util.ArrayList;
import java.util.List;

public class Lc141 {
	
	public static void main(String[] args) {
		
	}
	
    public boolean hasCycle(ListNode head) {
    	if(head == null){
    		return false;
    	}
    	List<ListNode> list = new ArrayList<ListNode> ();
    	list.add(head);
    	
    	ListNode root = head;
    	while(root.next != null){
    		root = root.next ;
    		if(list.contains(root)){
    			return true;
    		}
    		list.add(root);
    	}
    	return false;
    }
}
