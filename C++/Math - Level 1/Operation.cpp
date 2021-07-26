double operation(double num1, double num2, char symbol) {
    // Replace code here
    if(symbol == '+')
        return num1 + num2;
    else if(symbol == '-')
        return num1 - num2;
    else if(symbol == '*')
        return num1 * num2;
    else if(symbol == '/') 
        return num1 / num2;
    return 0.0;
}
