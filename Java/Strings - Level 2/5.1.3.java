public String justFirstAndLast(String name)
{
    String[] s = name.split("\\s+");
    return s[0] + " " + s[s.length - 1];
}