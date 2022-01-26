public String makeEven(String phrase) {
    if(phrase.length() % 2 != 0) {
        String str = phrase + " ";
        return str;
    }
    return phrase;
}