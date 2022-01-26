public static int[][] multiplicationTable(int size)
{
    int [][] yes = new int[size][size];
    for (int row = 0; row < yes.length ; row++) {
        for (int column = 0; column < yes[row].length; column++) {
             yes[row][column] = (row+1)*(column+1);         
        }

    }
    return yes;
}
