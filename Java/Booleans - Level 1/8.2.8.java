//8.2.8 Nums in Order
public boolean inOrder(int a, int b, int c) {
    if(a < b && b < c) {
        return true;
    } else if(a > b && b > c){
        return false;
    }
    return false;
}