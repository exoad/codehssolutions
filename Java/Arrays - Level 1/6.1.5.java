//6.1.5 Initializing an Array
public int[] makeArray(int size)
{
    // Implement this method
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
        arr[i] = i;
    }
    return arr;
}