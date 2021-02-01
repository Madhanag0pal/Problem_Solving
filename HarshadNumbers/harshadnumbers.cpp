#include <iostream>
#include <sstream>

using namespace std;
int main() {
    unsigned int n;
    cin >> n;
    bool c;
    do{
        string num = to_string(n);
        int sum=0;
        for(char j : num)
            sum += j - 48;
        c = n % sum;
        n++;   
    }while(c);
    cout << n-1;
    return 0;
}