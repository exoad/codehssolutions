function findUpperKey(phrase, key){
    // write your code here
    if(phrase.includes(key.toUpperCase())) 
        return phrase.indexOf(key.toUpperCase());
    return -1;
}
