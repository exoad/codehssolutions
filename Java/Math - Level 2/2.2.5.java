public static String repeatTwo(String word)
{
    char c1 = word.charAt(word.length() - 2);
    char c2 = word.charAt(word.length() - 1);
    for(int i = 0; i < 3; i++) {
        word += c1;
        word += c2;
    }
    return word;
    
}