public String lastElement(ArrayList<String> list)
{
    if(list.size() > 0) {
        return list.get(list.size() - 1);
    }
    return "";
}