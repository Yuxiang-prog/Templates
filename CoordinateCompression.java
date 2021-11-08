static void compress(int N, Integer[]cows, int[]xs, int[]ys) {
		Arrays.sort(cows, Comparator.comparingInt(j -> xs[j]));
		for (int x = 1; x <= N; x++) {
			xs[cows[x - 1]] = x;
		}
		Arrays.sort(cows, Comparator.comparingInt(j -> ys[j]));
		for (int y = 1; y <= N; y++) {
			ys[cows[y - 1]] = y;
		}
	}
