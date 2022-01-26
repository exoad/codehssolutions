public String reverse(String phrase) {
    char[] c = phrase.toCharArray();
    String temp = "";
    for(int i = c.length - 1; i >= 0; i--) 
        temp += c[i];
    return temp;
}