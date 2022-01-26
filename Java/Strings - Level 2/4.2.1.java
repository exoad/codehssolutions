public int findSecond(String phrase, String key) {
    return phrase.indexOf(key, phrase.indexOf(key) + 1);
}