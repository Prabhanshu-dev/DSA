package dsa.linkedlist;
class singlylinkedlist{
	
	 node head = null;
	
	class node{
		  node next = null;
		  int data=0;
		  node(int d){
			  data = d;
		  }
	}
	
	public  void insert(singlylinkedlist list , int d) {
		
		if(list.head == null) {
			node newnode = new node(d);
			  head = newnode;
		}else {
			node newnode = new node(d);
			node traverser = head;
			 while(traverser.next!=null) {
				 traverser = traverser.next;
			 }
			 traverser.next = newnode;
		}
	}
	
	public  void print(singlylinkedlist list) {
		       node traverser = list.head;
		    while(traverser.next!=null) {
		    	 System.out.print(traverser.data + "-->");
		    	 traverser = traverser.next;
		    	
		    }
		    System.out.print(traverser.data);
	}
	
	public static void main(String[]args) {
		singlylinkedlist  object  = new singlylinkedlist();
		 object.insert(object, 5);
		 object.insert(object,10);
		 object.insert(object,20);
		 object.insert(object,30);
		 object.insert(object,60);
		 object.print(object);
	}
}