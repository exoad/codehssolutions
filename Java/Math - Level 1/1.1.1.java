//1.1.1 Sum Numbers
public int findSum(int a, int b) {
	int sum = 0;
	for (int i = a; i < b; i++) {
	    sum = sum + i;
	}
	return sum;
}