//8.2.7 Sum Evens
public int sumEvens(int x, int y, int z)
{
    if(x%2==0 && y%2==0 && z%2==0) {
        return x+y+z;
    } else if(x%2==0 && y%2==0) {
        return x+y;
    } else if(y%2==0 && z%2==0) {
        return y+z;
    } else if(x%2==0 && z%2==0) {
        return x+z;
    } else if(x%2==0) {
        return x;
    } else if(y%2==0) {
        return y;
    } else if(z%2==0) {
        return z;
    }
    return 0;
}