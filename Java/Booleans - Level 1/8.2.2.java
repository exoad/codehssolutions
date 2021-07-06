//8.2.2 At Capacity
public boolean atCapacity(int people, int capacity)
{
    double a = people;
    double b = capacity;
    double ark = a/b;
    if(ark >= 0.80) return true;
    if(people > capacity) return true;
    return false;
}