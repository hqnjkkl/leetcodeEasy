package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

//Bonus points if you could solve it 
//both recursively and iteratively
public class SymmetricTree101 {

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(1);
//		root.left =  new TreeNode(2,new TreeNode(3),new TreeNode(4));
//		root.right =  new TreeNode(2,new TreeNode(4),new TreeNode(3));
//		boolean res = new SymmetricTree101().isSymmetric(root);
//		System.out.println(res);
		TreeNode root = new TreeNode(1,new TreeNode(2),new TreeNode(3));
//		root.left =  new TreeNode(2,null,new TreeNode(4));
//		root.right =  new TreeNode(2,null,new TreeNode(3));
		boolean res = new SymmetricTree101().isSymmetric(root);
		System.out.println(res);
	}

	public boolean isSymmetric(TreeNode root) {
		List<TreeNode> que = new ArrayList<TreeNode>();
	    TreeNode t = null;
		if(root!=null) {
			if(symmetric(root.left,root.right))
				que.add(root);
			else
				return false;
	    }
	    while(que.size()!=0) {
	    	int len = que.size();
	    	int l = 0,r = len-1;
	    	while(l<r) {
	    		TreeNode lt = que.get(l);
	    		TreeNode rt = que.get(r);
	    		if(symmetric(lt.left,rt.right)
	    				&&symmetric(lt.right,rt.left))
	    		{
	    			l++;
	    			r--;
	    		}else
		    	{
		    		return false;
		    	}
	    		if(l==r) {
	    			return false;
	    		}
	    	}
	    	for(int i=0;i<len;i++) {
	    		t = que.remove(0);
	    		if(t.left!=null)
	    			que.add(t.left);
	    		if(t.right!=null)
	    			que.add(t.right);
	    	}
	    }
	    return true;
	 }

	public boolean symmetric(TreeNode l, TreeNode r) {
		if (l == null && r == null)
			return true;
		if(l!=null && r!=null && l.val==r.val)
			return true;
		return false;
	}
}
