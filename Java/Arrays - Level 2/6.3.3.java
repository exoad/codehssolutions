public String[] repeatArray(String[] array) {
    String[] s = new String[array.length * 2];
    int t = array.length;
    for(int i = 0; i < array.length; i++) {
        s[i] = array[i];
        s[i + t] = array[i];
    }
    return s;
}
