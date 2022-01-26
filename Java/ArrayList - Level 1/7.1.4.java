public ArrayList<Integer> makeArrayList(int max)
{
    ArrayList<Integer> arrlist = new ArrayList<>();
    for(int i = 1; i <= max; i++) {
        arrlist.add(i);
    }
    return arrlist;
}