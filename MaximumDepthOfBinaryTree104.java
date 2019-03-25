package leetcodeEasy;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}
    
}
public class MaximumDepthOfBinaryTree104 {

	public static void main(String[] args) {

	}
	/**
	 * 5 minutes accepted
	 * @param root
	 * @return
	 */
    public int maxDepth(TreeNode root) {
        int left = 0,right=0;
        if(root==null)
        	return 0;
        left = maxDepth(root.left)+1;
        right = maxDepth(root.right)+1;
        return left>right?left:right;
    }
}

/**
 * Definition for a binary tree node.
 * */
  
 
