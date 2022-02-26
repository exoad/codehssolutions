public int max(int[] array) {
    if(array.length == 0) 
        return 0;
    int temp = array[0];
    for(int x : array) {
        if(x > temp)
            temp = x;
    }
    return temp;
}
