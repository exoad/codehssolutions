//8.2.13 Can we make it?
public static boolean canWeMakeIt(double distance, double totalGallonsLeft, double milesPerGallon)
{
    if(milesPerGallon * totalGallonsLeft >= distance) {
        return true;
    }
    return false;
}