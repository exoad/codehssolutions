/*
The compile error is as follows:
/usr/lib/gcc/x86_64-linux-gnu/7/../../../x86_64-linux-gnu/Scrt1.o: In function `_start':
(.text+0x20): undefined reference to `main'
collect2: error: ld returned 1 exit status
*/

//this code would work fine, but the codehs systems are not writing the code to run this method correctly.
int product(int a, int b) {
    return a * b;
}
