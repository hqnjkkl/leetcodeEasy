package leetcodeEasy;

public class TreeToLinkedList {

	public static void main(String[] args) {
		  
	}
    public TreeNode Convert(TreeNode pRootOfTree) {
    	TreeNode ll = traverse(pRootOfTree);
        while(ll.left!=null)
            ll = ll.left;
        return ll;
    }

	 public TreeNode traverse(TreeNode root){
		 TreeNode n;
	        if(root.left==null && root.right==null){
	            return root;
	        }else{
	          if(root.left!=null){
	            n = traverse(root.left);
	              //这个n需要把尾节点拿出来
	            while(n.right!=null)
	                n = n.right;
	            n.right = root;
	            root.left = n;
	        }
	        if(root.right!=null){
	            n = traverse(root.right);
	            //这个n需要把头结点拿出来
	            while(n.left!=null)
	                n = n.left;
	            n.left = root;
	            root.right = n;
	        }
	            return root;
	        }
	    }
}
