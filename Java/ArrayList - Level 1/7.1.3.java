public String middleElement(ArrayList<String> list)
{
    if(list.size() > 0) {
        return list.get(list.size() / 2);
    }
    return "";
}