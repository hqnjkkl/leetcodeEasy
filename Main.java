package leetcodeEasy;
/**
 * 头条的面试题，剑指offer原题                                                       
 * @author Administrator
 *
 */
class Node{
    int val;
    Node left;//head
    Node right;//tail
    public Node(int v){this.val = v;}
    public Node(int v,Node l,Node r){
        this.val = v;
        left =  l;
        right = r;
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Node root = new Node(10,new Node(5),new Node(15));
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(13,null,new Node(14));
        Main m = new Main();
        Node ll = m.traverse(root);
        while(ll.left!=null)
        	ll = ll.left;
        
        while(ll!=null){
            System.out.println(ll.val);
            ll = ll.right;
        }
    }
    public Node traverse(Node root){
        Node n;
        if(root.left==null && root.right==null){
            return root;
        }else{
          if(root.left!=null){
        	  n = traveLeft(root.left);
        	  root.left = n;
        	  n.right = root;
          }
          if(root.right!=null) {
        	  n = traveRight(root.right);
        	  root.right = n;
        	  n.left = root;
          }
          return root;
        }
    }
    public Node traveLeft(Node root) {
    	Node n;
    	if(root.left==null && root.right==null){
            return root;
        }
    	if(root.left!=null){
      	  n = traveLeft(root.left);
      	  root.left = n;
      	  n.right = root;
        }
    	 if(root.right!=null) {
       	  n = traveRight(root.right);
       	  root.right = n;
       	  n.left = root;
         }
    	 while(root.right!=null) {
    		 root = root.right;
    	 }
         return root;
    }
    
    public Node traveRight(Node root) {
    	Node n;
    	if(root.left==null && root.right==null){
            return root;
        }
    	if(root.left!=null){
      	  n = traveLeft(root.left);
      	  root.left = n;
      	  n.right = root;
        }
    	 if(root.right!=null) {
       	  n = traveRight(root.right);
       	  root.right = n;
       	  n.left = root;
         }
    	 while(root.left!=null) {
    		 root = root.left;
    	 }
         return root;
    }
}