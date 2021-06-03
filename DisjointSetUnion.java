
public class DisjointSetUnion {
	public static int disjoint[]; //0 indexed
	public static int size[];
	//finds the "representative" node in a's component
	public static int find(int v) {
		if (disjoint[v] == -1) {
			return v;
		}
		disjoint[v] = find(disjoint[v]);
		return disjoint[v];
	}

	//returns whether the merge changed connectivity
	public static void union(int u, int v) {
		int uroot = find(u);
		int vroot = find(v);
		if (uroot == vroot) {
			return;
		}
		if (size[uroot] < size[vroot]) {
			disjoint[uroot] = vroot;
			size[vroot] = size[uroot] + size[vroot];
		} else {
			disjoint[vroot] = uroot;
			size[uroot] = size[uroot] + size[vroot];
		}
	}
}
