public String like(String phrase) {
    String[] arr = phrase.split(" ", 0);
    
    if(arr[0].equals("like")) {
        return phrase;
    } else {
        return "like " + phrase;
    }

}