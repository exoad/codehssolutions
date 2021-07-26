# IMPORTANT

A lot of these code are throwing Compile Errors not because the code is incorrect but because there is most likely a backend error with CodeHS.

A common error:
```
/usr/lib/gcc/x86_64-linux-gnu/7/../../../x86_64-linux-gnu/Scrt1.o: In function `_start':
(.text+0x20): undefined reference to `main'
collect2: error: ld returned 1 exit status
```

If you want to check if the mentioned code piece will run properly, use this template:

```
#include <bits\stdc++.h>

using namespace std;

int methodNameHere(parameters) {
  //items
}

int main()
{
    cout << methodNameHere(parameters) << endl;
}
```
