package com.lc;

public class Lc112 {
	
	public static void main(String[] args) {
		
	}
	
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root == null){
    		return false;
    	}
    	if(root.left == null && root.right == null ){
    		return sum-root.val == 0 ;
    	}
    	
    	return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
