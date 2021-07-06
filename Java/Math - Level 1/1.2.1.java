//1.2.1 Product Range
public int productRange(int a, int b) {
    if(a==b){
        return a;
    }
    if(a == b-1){
        return a*b;
    }
    int product = a*b;
    product = product*productRange(a+1,b-1);
    return product;
}