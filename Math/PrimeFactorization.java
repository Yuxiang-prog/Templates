static ArrayList<Integer> factor(int n) {
	ArrayList<Integer> factors = new ArrayList<>();
	for (int i = 2; i * i <= n; i++) {
		while (n % i == 0) {
			factors.add(i);
			n /= i;
		}
	}
	if (n > 1) factors.add(n);
	return factors;
}

/*
This algorithm runs in O(sqrt(N)) time because the loop checks divisibility for at most sqrt(N) time 
*/
