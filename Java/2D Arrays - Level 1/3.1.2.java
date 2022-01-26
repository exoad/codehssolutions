public static boolean isSquare(int[][] arr)
{
    for (int i = 0, l = arr.length; i < l; i++) {
        if (arr[i].length != l) {
            return false;
        }
    }
    return true;
}
