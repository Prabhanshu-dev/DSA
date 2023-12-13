package dsa.stack;
class stack{
	
	
	   int capacity;
	   int arr[];
	   int top;  // top is counter to traverse the stack, when we insert we insert element at particular position of top in a stack
	               //  when we pop  , basically we are just bringing our top down towards -1 in stack  ,not removing any element pratically.
	 
	   //we will create the array and all other requirements needed for stack 
	
	 stack(int n){
		  capacity = n;
		  arr = new int[5];
		  top = -1;
	 }
	
	
	
	public void push(int n) {
		
		 
		 if(isfull()) {
			 System.out.println("stack is full");
		 }else {
			 arr[++top] = n;
			 System.out.println("element inserted in the stack");
		 }
		 
	
	}
	
	 Boolean isfull(){
		if(top == capacity-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int pop () {
		
		if(isEmpty()) {
			System.out.println("stack is alrady empty so no pop up needed");
		}
		return arr[top--];
		
	}
	
	Boolean isEmpty() {
		
		if(top == -1) {
			 return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[]args) {
		
		  stack object = new stack(5);
		  
	}
}