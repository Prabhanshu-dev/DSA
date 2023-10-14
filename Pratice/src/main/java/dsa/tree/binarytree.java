package dsa.tree;



class binarytree{
	
	 Node  base = null;
	 
	 class Node{
		    int data =0;
		    Node left =null;
		    Node right = null;
		    Node(int d){
		    	data = d;
		    }
		 
	 }
	 
	 public Node createbinarytreenode(int d) {
		 Node newnode = new Node(d);
		 return newnode;
	 }
	 public void inserttreeleft(binarytree tree ,int d) {
		 if(tree.base == null) {
			 Node newnodemade =  createbinarytreenode(d);
			   base= newnodemade; 
		 }else {
			 Node newnode = new Node(d);
			 Node traverser = base;
			 while(traverser.left!=null) {
				 traverser = traverser.left;
			 }
			 traverser.left = newnode;
		 }
		 
	 }
	 
	 public void inserttreeright(binarytree tree ,int d) {
		 if(tree.base == null) {
			 createbinarytreenode(d);
		 }else {
			 Node newnode = new Node(d);
			 Node traverser = base;
			 while(traverser.right!=null) {
				 traverser = traverser.right;
			 }
			 traverser.right = newnode;
		 }
		 
	 }
	 public void printbinarytreecreated(binarytree tree) {
		 Node traverser = tree.base;
		    while(traverser!=null) {
		    	 System.out.print(traverser.data);
		    	 traverser = traverser.left;
		    }
		    Node traverser1 = tree.base.right;
		    while(traverser1!=null) {
		    	System.out.print("--->");
		    	 System.out.print(traverser1.data);
		    	 traverser1 = traverser1.right;
		    }
		   // System.out.print(traverser.data);
		   // System.out.print(traverser.right.data);
		   
	 }
	 
	 public void preorderbinarytree(Node base2) {
		    if(base2==null) {
		    	return;
		    }
		    System.out.print(base2.data);
		    preorderbinarytree(base2.left);
		    preorderbinarytree(base2.right);
		   
	 }
	 
	 public static void main(String[]args) {
		 
		 binarytree object = new binarytree();
		 object.inserttreeleft(object , 9);
		 object.inserttreeleft(object, 2);
		 object.inserttreeright(object, 3);
		 object.inserttreeright(object, 4);
		// object.printbinarytreecreated(object);
		 object.preorderbinarytree(object.base);
		 
		 
		 
	 }
}