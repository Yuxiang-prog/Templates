public static ArrayList<Integer> adj[];
public static ArrayList<Integer> rep = new ArrayList<Integer>();
static boolean visited[]; 

public static void main(String[]args) throws Exception {
    adj = new ArrayList[N+1];
		visited = new boolean[N+1];
		for (int i = 0; i <= N; i++) adj[i] = new ArrayList<Integer>();
  
  
  public static void dfs(int node){
		visited[node] = true;
		for (int u: adj[node])
			if(!visited[u])
				dfs(u);
	}
}

/* The above code is with an adjacency List. Instead an adjacency matrix can also be used */
public static boolean[][]adj;
static void dfs(int pos) {
    visited[pos] = true;
    for (int to = 0; to < P; to++) {
    if (adj[pos][to] && !visited[to]) dfs(to);
}

static class Edge{
    int a, b;
    Edge(int a, int b) {
	this.a = a;
	this.b = b;
    }
}
	
	
	
