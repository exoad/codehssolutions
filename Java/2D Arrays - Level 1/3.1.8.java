public static String[][] createArray(int row, int col)
{
    String[][] arr = new String[row][col];
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[i].length; j++) {
            arr[i][j] = "";
        }
    }
    return arr;
}
