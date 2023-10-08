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
			 traverser = newnode;
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
			 traverser = newnode;
		 }
		 
	 }
	 public void printbinarytreecreated(binarytree tree) {
		 Node traverser = tree.base;
		    while(traverser.left!=null) {
		    	 System.out.print(traverser.data + "-->");
		    	 traverser = traverser.left;
		    }
		    System.out.print(traverser.data);
		   
	 }
	 public static void main(String[]args) {
		 
		 binarytree object = new binarytree();
		 object.inserttreeleft(object , 5);
		 
	 }
}