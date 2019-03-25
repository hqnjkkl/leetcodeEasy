package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

//Bonus points if you could solve it 
//both recursively and iteratively
//recursively methods
public class SymmetricTree101_2 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left =  new TreeNode(2,new TreeNode(3),new TreeNode(4));
		root.right =  new TreeNode(2,new TreeNode(4),new TreeNode(3));
		boolean res = new SymmetricTree101().isSymmetric(root);
		System.out.println(res);
//		TreeNode root = new TreeNode(1);
//		root.left =  new TreeNode(2,null,new TreeNode(4));
//		root.right =  new TreeNode(2,null,new TreeNode(3));
//		boolean res = new SymmetricTree101_2().isSymmetric(root);
//		System.out.println(res);
	}

	public boolean isSymmetric(TreeNode root) {
		if(root!=null) {
			return symmetric(root.left,root.right);
		}else {
			return true;
		}
	 }
	
	public boolean symmetric(TreeNode l, TreeNode r) {
		if (l == null && r == null)
			return true;
		if(l!=null && r!=null && l.val==r.val) {
			if(symmetric(l.left, r.right)) {
				return symmetric(l.right,r.left);
			}
		}
		return false;
	}
}
