public double average(int[] array) {
    if(array.length == 0) 
        return 0;
    int sum = 0;
    for(int x : array) sum += x;
    return (double) sum / (array.length);
}
