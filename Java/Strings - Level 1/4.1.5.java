//4.1.5 Find the Key Part 2
public int findUpperKey(String phrase, String key) {   
    if(phrase.contains(key.toUpperCase())) {
        return phrase.indexOf(key.toUpperCase());
    } else {
        return -1;
    }
}