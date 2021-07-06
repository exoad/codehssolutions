//8.2.12 Password Length
public static boolean isValid(String password)
{
    if(password.length() < 8) {
        return false;
    }   
    return true;
}