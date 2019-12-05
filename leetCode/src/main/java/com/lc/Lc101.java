package com.lc;

public class Lc101 {
//    1
//   / \
//  2   2
// / \ / \
//3  44   3	
	public static void main(String[] args) {
		TreeNode tn= new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(2);
		tn.left.left = new TreeNode(3);
		tn.left.right = new TreeNode(4);
		tn.right.left = new TreeNode(4);
		tn.right.right = new TreeNode(3);
		
		Lc101 lc = new Lc101() ;
		
		System.out.println(lc.isSymmetric(tn));
		
	}
	
    public boolean isSymmetric(TreeNode root) {
    	
    	if(root == null){
    		return true;
    	}
    	return symmetric(root.left, root.right) ;   
    }
    
    public boolean symmetric(TreeNode left,TreeNode right){
    	
    	if(left != null && right != null){
    		if( left.val != right.val){
    			return false;
    		}
    	}
    	if((left == null || right == null )&&!(left == null && right == null)){
    		return false;
    	}
    	if(left == null && right == null){
    		return true;
    	}
    	return left!=null && right != null ?symmetric(left.left, right.right) && symmetric(left.right, right.left):false ;
    }
    
}
