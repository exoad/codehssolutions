function like(phrase){
    // write your code here
    const p = phrase.split(" ");
    if(p[0] != "like")
        p.unshift("like");
        
    return p.join(' ');
}
