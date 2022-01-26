public ArrayList<Clothes> onlyBlue(Clothes[] clothes)
{
    ArrayList<Clothes> only = new ArrayList<>();
    for(int i = 0; i < clothes.length; i++)
        if(clothes[i].getColor().equals("blue"))
            only.add(clothes[i]);
            
    return only;
}
