static int[] hd = new int[MN], nx = new int[MN], to = new int[MN], s = new int[MN], p = new int[MN];

public static void adde(int u, int v, int id){
  nx[id] = hd[u];
	hd[u] = id;
	to[id] = v;
}

public static void dfs(int node){
  s[node]=1;
	for(int id=hd[node];id!=0;id=nx[id]){
		dfs(to[id]);
		s[node]+=s[to[id]];
  }
}

adde(p[i], i, i);
dfs(1);
