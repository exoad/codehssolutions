public String switchWords(String phrase) {
    String[] w = phrase.split("\\s+");
    return w[1] + " " + w[0];
    
}