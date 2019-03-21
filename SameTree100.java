package leetcodeEasy;

public class SameTree100 {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(2,new TreeNode(1),new TreeNode(3));
		TreeNode q = new TreeNode(2,new TreeNode(1),new TreeNode(3));
		System.out.println(new SameTree100().isSameTree(p, q));
	}
	/**
	 * accepted 16minutes
	 * @param p
	 * @param q
	 * @return
	 */
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null && q==null)
    		return true;
    	if(p!=null && q!=null) {
    		if(p.val==q.val)
	    		if(isSameTree(p.left,q.left)) {
	    			return isSameTree(p.right,q.right);
	    		}	
    	}
    	return false;
}
    
}



