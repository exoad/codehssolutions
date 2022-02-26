public String[] swapFirstLast(String[] array) {
    if(array.length == 0)
        return array;
    String first = array[0];
    array[0] = array[array.length - 1];
    array[array.length - 1] = first;
    return array;
}
