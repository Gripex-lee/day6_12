package day6_12;

import java.util.Queue;

/*class Nod {
	 int data;
	 Nod left, right;
	 Nod(int item) {
	  data = item;
	  left = right = null;
	 }
	}*/

public class A053 {
	Nod root;
	public static void main(String[] args) {
		A053 tree = new A053();
		tree.root = new Nod(1);
		  tree.root.left = new Nod(2);
		  tree.root.right = new Nod(3);
		  tree.root.left.left = new Nod(4);
		  tree.root.left.right = new Nod(5);
		  tree.root.right.left = new Nod(6);
		  tree.root.right.right = new Nod(7);
		  tree.root.right.left.left = new Nod(8);
		  tree.root.right.right.right = new Nod(9);
		  tree.printTreeDiagonally(tree.root);
	}
	
	void printTreeDiagonally(Nod t){
        Queue  <Nod> q = new java.util.LinkedList<>();
    	if (t == null)
    	   return;
    	q.add(null);
    	do{ 
    	    while(t != null )
    	    {
    	      if (t.left != null)
    	    	q.add(t.left);
    	      System.out.print(t.data+" ");
    	      t=t.right;	  
    	    }
    	    if (!q.isEmpty()){
    	        t = q.remove();
    	    	if ( t==null){
    	    	  System.out.println();
    	    	  if (!q.isEmpty()){
    	    		  t = q.remove();
    	    	  }
    	    	  else
    	    		  break;
    	    	  q.add(null);
    	    	}
    	    }
    	       	    
    	}while(!q.isEmpty());
    }
}
