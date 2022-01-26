public static double average(ArrayList<Integer> arr)
{
    double sum = 0.0;
    for(int i = 0; i < arr.size(); i++) {
        sum += arr.get(i);
    }
    return (double) sum / arr.size();
}
