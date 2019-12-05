package com.lc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Lc155 {

	 public static void main(String[] args) {
		 
		 MinStack minStack = new MinStack();
		 minStack.push(-2);
		 minStack.push(0);
		 minStack.push(-3);
		 System.out.println(minStack.getMin());   
		 minStack.pop();
		 System.out.println(minStack.top());      
		 System.out.println(minStack.getMin());   

		 
		 
//		 System.out.println(param_3+":"+param_4);
	}
}



class MinStack {

	LinkedList<Integer> minList = new LinkedList<Integer>();
	Stack<Integer> stack = null;
    public MinStack() {
    	stack = new Stack<Integer>() ;
    }
    
    public void push(int x) {
    	minList.add(x);
    	stack.push(x);
        
    }
    
    public void pop() {
    	int pop = stack.pop() ;
    	Iterator<Integer> iterator = minList.iterator();
    	while(iterator.hasNext()){
    		int curr = iterator.next() ;
    		if(curr == pop){
    			iterator.remove(); // 可能存在多个相同,删除一个 
    			break;
    		}
    	}
    }
    
    public int top() {
        return stack.peek() ;
    }
    
    public int getMin() {
        int min =Integer.MAX_VALUE ;
    	Iterator<Integer> iterator = minList.iterator();
    	while(iterator.hasNext()){
    		int curr = iterator.next() ;
    		min = Math.min(min, curr);
    	}
    	return min;
    }
}
