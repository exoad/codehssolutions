public double arrayListSum(ArrayList<Double> list)
{
    double sum = 0.0;
    for(int i = 0; i < list.size(); i++) 
        sum += list.get(i);
    return sum;
}
