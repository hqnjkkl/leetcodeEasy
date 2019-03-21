package leetcodeEasy;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		ConvertSortedArrayToBinarySearchTree csa = new ConvertSortedArrayToBinarySearchTree();
		TreeNode res = csa.sortedArrayToBST(new int[] {-10,-3,0,5,9});
		Tranverse.tranverse(res);
	}
	/**
	 * accepted 5minutes
	 * @param nums
	 * @return
	 */
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        if(nums==null)
        	return root;
        int len = nums.length;
        root = sortedArrayToBST(nums,0,len-1);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums,int s,int e) {
    	if(s>e)
    		return null;
    	int mid = (s+e)/2;
    	TreeNode tn = new TreeNode(nums[mid]);
    	tn.left = sortedArrayToBST(nums,s,mid-1);
    	tn.right = sortedArrayToBST(nums,mid+1,e);
    	return tn;
    }
}

class Tranverse{
	public static void tranverse(TreeNode tn) {
		Queue<TreeNode> que = new LinkedBlockingQueue<>();
		if(tn!=null) {
			que.add(tn);
		}
		while(que.size()>0) {
			int len = que.size();
			for(int i=0;i<len;i++) {
				TreeNode node = que.poll();
				System.out.print(node.val+" ");
				if(node.left!=null) 
					que.add(node.left);
				if(node.right!=null)
					que.add(node.right);
			}
			System.out.println();
		}
	}
}
