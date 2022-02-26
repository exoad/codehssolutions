public int[] reverse(int[] arr) {
    int[] temp = new int[arr.length];
    for(int i = arr.length, j = 0; i > 0 && j < temp.length; i--, j++) {
        temp[j] = arr[i - 1];
    }
    return temp;
}
