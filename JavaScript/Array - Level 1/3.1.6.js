function evens(array) {
    const temp = [];
    array.forEach(function(item) {
        if(item % 2 == 0)
            temp.push(item);
    })
    return temp;
        
}
