package day6_12;

import java.util.LinkedList;  

class Node {  
    int root;  
    Node left;  
    Node right;  
    Node(int item) {
    	  root = item;
    	  left = right = null;
    }
}  
  
public class A052 {
	static Node root;
	public static void main(String[] args) {
		A052 tree =new A052();
		tree.root = new Node(1);
		  tree.root.left = new Node(2);
		  tree.root.right = new Node(3);
		  tree.root.left.left = new Node(4);
		  tree.root.left.right = new Node(5);
		  tree.root.right.left = new Node(6);
		  tree.root.right.right = new Node(7);
		  tree.root.right.left.left = new Node(8);
		  tree.root.right.right.right = new Node(9);
		  if(tree.isCompleteTree(root)) {
			  System.out.println("YES");
		  }else {
			  System.out.println("NO");
		  }
	}
	
    //实现广度遍历需要的队列  
    private LinkedList<Node> queue = new LinkedList<Node>();  
    //第n层最右节点的标志  
    private boolean leftMost = false; 
    public boolean processChild(Node child) {  
        if(child != null) {  
            if(!leftMost) {  
                queue.addLast(child);  
            } else {  
                return false;  
            }  
        } else {  
            leftMost = true;  
        }  
        return true;  
    }  
      
    public boolean isCompleteTree(Node root) {  
        //空树也是完全二叉树  
        if(root == null) return true;  
        //首先根节点入队列  
        queue.addLast(root); 
        while(!queue.isEmpty()) {  
            Node node = queue.removeFirst();
            //处理左子结点  
            if(!processChild(node.left))  
                return false;  
            //处理右子结点  
            if(!processChild(node.right))  
                return false;  
        } 
        //广度优先遍历完毕，此树是完全二叉树  
        return true;  
    }  
}
