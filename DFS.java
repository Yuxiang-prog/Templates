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
