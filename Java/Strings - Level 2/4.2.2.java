public String grammer(String phrase) {
    int i = phrase.indexOf("A");
    char c = phrase.charAt(2);
    if("aeiouAEIOU".indexOf(c) != -1) {
        phrase = phrase.substring(0,i) + "An" + phrase.substring(i + 1);
        return phrase;
    }        
    return phrase;
    
}