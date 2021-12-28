public int gcd(int a, int b) {
	return b == 0 ? a : gcd(b, a % b);
}
/*
Returns the largest integer that is a factor of both a and b using the euclidean algorithm 
*/
