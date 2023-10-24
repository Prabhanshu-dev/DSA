package dsa.graph;

class graph{
	
	 private int adj[][];
	 int v;
	 int e;
	
	 graph(int node) {
		 this.v=node;
		 this.e=0;
		 this.adj = new int[node][node];
		  
	 }
	 
	 public void intializematrixnodes(int u, int v) {
		  adj[u][v] = 1;
		  adj[v][u] = 1;
		  e++;
	 }
	 
	 public String toString() {
		 StringBuilder  sb = new StringBuilder();
		 sb.append(v+" vertices "+ e + " edges " + "\n");
		 for(int i=0;i<v;i++){
			 sb.append(i + " :");
			 for(int w :adj[i]) {
				 sb.append(w + " ");
			 }
			 sb.append("\n");
		 }
		 return sb.toString();
		 
	 }
	 
	 public static void main( String[]args){
		graph  g = new graph(4);
		/*g.intializematrixnodes(0,1);
		g.intializematrixnodes(1, 2);
		g.intializematrixnodes(2, 3);
		g.intializematrixnodes(3, 3);*/
		 g.intializematrixnodes(0, 0);
		 g.intializematrixnodes(0, 0);
		System.out.println(g);
	 }
	 
}