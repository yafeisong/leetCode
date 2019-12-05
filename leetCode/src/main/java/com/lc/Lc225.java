package com.lc;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Lc225 {
	public static void main(String[] args) {
		 MyStack obj = new MyStack();
		 obj.push(1);
		 obj.push(2);
		 int param_3 = obj.top();
		 int param_2 = obj.pop();
		 boolean param_4 = obj.empty();
		 
		 System.out.println(String.format("%s-%s-%s", param_2,param_3,param_4));
	}

}
class MyStack {

	Queue<Integer> queue = new LinkedBlockingQueue<Integer> ();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
//        int peek = queue
    	
    	int peek = 0 ;
    	
    	Iterator<Integer> it = queue.iterator() ;
    	
    	while(it.hasNext()){
    		peek =it.next() ;
    	}
    	it.remove(); 
        return peek;
    }
    
    /** Get the top element. */
    public int top() {
    	int peek = 0 ;
    	
    	Iterator<Integer> it = queue.iterator() ;
    	
    	while(it.hasNext()){
    		peek =it.next() ;
    	}
        return peek;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}