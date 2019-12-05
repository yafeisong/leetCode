package com.lc;

public class Lc111 {
	
//    3
//   / \
//  9  20
//    /  \
//   15   7
	
	
	public static void main(String[] args) {
		
//		TreeNode tn1 = new TreeNode(3);
//		tn1.left = new TreeNode(9);
//		tn1.right = new TreeNode(20);
//		tn1.right.left=new TreeNode(15);
//		tn1.right.right = new TreeNode(7);
		
//		TreeNode tn1 = new TreeNode(3);
//		tn1.left = new TreeNode(9);
//		tn1.left.left = new TreeNode(20);
//		tn1.left.left.left=new TreeNode(15);
//		tn1.left.left.left.left = new TreeNode(7);

		TreeNode tn1 = new TreeNode(3);
		tn1.right = new TreeNode(9);
		tn1.right.right = new TreeNode(20);
		tn1.right.right.right=new TreeNode(15);
		tn1.right.right.right.right= new TreeNode(7);
		
		
		Lc111 lc = new Lc111() ;
		
		System.out.println(lc.minDepth(tn1));
		
	} 
//    int leftDep =  0 ;
//    int rightDep = 0 ;
//	public int minDepth(TreeNode root) {
//		if(root == null){
//			return 0 ;
//		}else{
//			leftDep = 1;
//			rightDep = 1;
//		}
//		if(root.left == null && root.right == null){
//			return 1;
//		}
//		calc(root.left,root.right);
//		
//		return Math.min(leftDep==1?Integer.MAX_VALUE:leftDep, rightDep==1?Integer.MAX_VALUE:rightDep);
//    }
//	public int calc(TreeNode left,TreeNode right){
//		if( left != null){
//			if((left != null && left.left==null && left.right==null )){
//				return leftDep+=1;
//			}
//			leftDep +=1;
//		}
//		if( right != null){
//			if ((right != null && right.left == null && right.right == null)){
//				return rightDep +=1;
//			}
//			rightDep +=1;
//		}
//		return Math.min(left !=null ?calc(left.left, left.right):0,right !=null ?calc(right.left,right.right):0) ;
//	}
	
	
	
	
	
	  public int minDepth(TreeNode root) {
		    if (root == null) {
		      return 0;
		    }

		    if ((root.left == null) && (root.right == null)) {
		      return 1;
		    }

		    int min_depth = Integer.MAX_VALUE;
		    if (root.left != null) {
		      min_depth = Math.min(minDepth(root.left), min_depth);
		    }
		    if (root.right != null) {
		      min_depth = Math.min(minDepth(root.right), min_depth);
		    }

		    return min_depth + 1;
		  }

	
}
