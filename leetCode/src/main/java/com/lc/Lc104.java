package com.lc;

public class Lc104 {
	
	public static void main(String[] args) {
//	    3
//	    / \
//	   9  20
//	     /  \
//	    15   7
		
		TreeNode tn1 = new TreeNode(3);
		tn1.left = new TreeNode(9);
//		tn1.right = new TreeNode(20);
//		tn1.right.left=new TreeNode(15);
//		tn1.right.right = new TreeNode(7);
		
		Lc104 lc = new Lc104() ;
		
		System.out.println(lc.maxDepth(tn1));
		
	}
	
//	int maxDeepth = 1 ;
//	int maxDeepthLeft = 1;
//	int maxDeepthRight = 1;
	
	
	public int maxDepth(TreeNode root) {
		int max = 0 ;
		if(root == null){
			return 0 ;
		}else{
			max =1 ;
		}
		 max += calc(root.left,root.right);
		
		return max;
    }
	public int calc(TreeNode left,TreeNode right){
		int max = 0 ;
		if(left == null && right == null){
			return max;
		}
		if(left != null || right != null){
			max ++ ;
		}
		return Math.max(left !=null ?calc(left.left, left.right)+max:0,right !=null ?calc(right.left,right.right)+max:0) ;
	}
}
