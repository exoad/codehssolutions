//8.2.4 Heart Rate
public boolean isHeartRateHealthy(int beats)
{
    if(beats >= 60 && beats <= 100) return true;
    return false;
}