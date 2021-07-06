//8.2.5. Enough Paint
public boolean hasEnoughPaint(int gallons, double squareFeet) {
    if (gallons < squareFeet/5) return false;
    return true;
}