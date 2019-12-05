package com.lc;

import java.util.Iterator;
import java.util.LinkedList;


public class Lc100 {
	
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		TreeNode pLeft = new TreeNode(2);
		TreeNode pRight = new TreeNode(3);
		
		p.left = pLeft;
		p.right = pRight ;
		
		TreeNode q = new TreeNode(1);
		TreeNode qLeft = new TreeNode(2);
		TreeNode qRight = new TreeNode(3);
		q.left = qLeft;
		q.right = qRight ;
		
		Lc100 lc = new Lc100() ;
		
		System.out.println(lc.isSameTree(p, q));
		
		
	}
	
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
		LinkedList<TreeNode> pTreeNodeList = new LinkedList<TreeNode> ();
		LinkedList<TreeNode> qTreeNodeList = new LinkedList<TreeNode> ();
		
		LinkedList<TreeNode> pRowTreeNodeList = new LinkedList<TreeNode> ();
		pRowTreeNodeList.add(p);
		
		
		LinkedList<TreeNode> qRowTreeNodeList = new LinkedList<TreeNode> ();
		qRowTreeNodeList.add(q);
		
		boolean iteratorFlag = true;
		while(iteratorFlag){
			Iterator<TreeNode> pIterator = pRowTreeNodeList.iterator() ;
			LinkedList<TreeNode> everyRow = new LinkedList<TreeNode> ();
			while(pIterator.hasNext()){
				TreeNode curr = pIterator.next() ;
				pTreeNodeList.add(curr);
				pIterator.remove();
				if(curr != null){
					everyRow.add(curr.left);
					everyRow.add(curr.right);
				}
			}
			if(everyRow.size()>0){
				pRowTreeNodeList = everyRow ;
			}else{
				iteratorFlag = false;
			}
		}
		iteratorFlag = true;
		while(iteratorFlag){
			Iterator<TreeNode> qIterator = qRowTreeNodeList.iterator() ;
			LinkedList<TreeNode> everyRow = new LinkedList<TreeNode> ();
			while(qIterator.hasNext()){
				TreeNode curr = qIterator.next() ;
				qTreeNodeList.add(curr);
				qIterator.remove();
				if(curr !=null){
					everyRow.add(curr.left);
					everyRow.add(curr.right);
				}
			}
			if(everyRow.size()>0){
				qRowTreeNodeList = everyRow ;
			}else{
				iteratorFlag = false;
			}
		}
		
		for(int index = 0 ;index<pTreeNodeList.size();index ++){
			TreeNode ptn = pTreeNodeList.get(index) ;
			TreeNode qtn = qTreeNodeList.get(index);
			
			if(!((ptn != null && qtn != null && ptn.val == qtn.val) || (ptn == qtn && ptn == null))){
				return false;
			}
		}
    	return true;   
    }
}
