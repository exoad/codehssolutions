public static int sumAll(int[][] arr) {
    int sum = 0;
    for (int row=0; row < arr.length; row++) {
        for (int col=0; col < arr[row].length; col++) {
            sum = sum + arr [row][col];
        }
    }

    return sum;
}
