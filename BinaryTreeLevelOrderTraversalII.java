package leetcodeEasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
	static void printMatrix(List<List<Integer>> list) {
		for(List<Integer> l:list) {
			for(Integer i:l) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
		List<List<Integer>> res = new BinaryTreeLevelOrderTraversalII().levelOrderBottom(p);
		printMatrix(res);
	}
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        List<TreeNode> que = new ArrayList<TreeNode>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if(root==null)
        return res;
        que.add(root);
        while(que.size()!=0) {
        	List<Integer> level = new ArrayList<>();
        	int len = que.size();
        	for(int i=0;i<len;i++) {
        		TreeNode node = que.poll();
        		level.add(node.val);
        		if(node.left!=null)
        			que.add(node.left);
        		if(node.right!=null)
        			que.add(node.right);
        	}
        	res.add(0, level);
        }
        return res;
    }
}
