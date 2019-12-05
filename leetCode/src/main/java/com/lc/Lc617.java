package com.lc;

import com.lc.TreeNode;

public class Lc617 {
	
	public static void main(String[] args) {
		Lc617 lc = new Lc617() ;
		
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(2);
		t1.left.left = new TreeNode(3);
		
		TreeNode t2 = new TreeNode(1);
		t2.right = new TreeNode(2);
		t2.right.right = new TreeNode(3);
		
		TreeNode ans = lc.mergeTrees(t1, t2) ;
		
		while(ans != null ){
//			TreeNode lef = ans.left ;
//			TreeNode righ = ans.right ;
			System.out.println(String.format("%s-->left:%s_right:%s", ans.val,ans.left==null?null:ans.left.val,ans.right==null?null:ans.right.val));
			
		}
		
		
	}
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode ans = new TreeNode(-1);
		TreeNode root = ans;
		ans = merge(ans, t1,t2) ;
    	return ans;
    }
	public TreeNode merge(TreeNode ans ,TreeNode t1, TreeNode t2) {
//		if (t1 == null && t2 == null){
//			return null;
//		}else{
//			int t1V = t1 != null ?t1.val :0 ;
//			int t2V = t2 != null ?t2.val : 0 ;
//			int newV = t1V + t2V ;
//			if (ans == null){
//				ans = new TreeNode(newV);
//			}else{
//				ans.val = newV ;
//			}
//		}
//		if (t1 != null && t2 != null){
//			ans.left = merge(ans.left, t1!=null ?t1.left:null,t2!=null ?t2.left:null);
//			ans.right = merge(ans.right,t1!=null ?t1.right:null,t2!=null ?t2.right:null);
//		}
		
//		ans.left = 
		
		return ans;
	}
}
