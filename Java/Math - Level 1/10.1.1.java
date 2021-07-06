//10.1.1 Shooting Percentage
public double shootingPercentage(int fgm, int fga) {
    if(fgm == 0 && fga == 0) return 0;
    double a = fgm;
    double b = fga;
    return a/b;
}