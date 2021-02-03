#include <iostream>
using namespace std;

int main()
{
    long int i,j,a;
    cin>> i >>j;
    while(!cin.eof()){
        a = (i > j)? (i-j):(j-i);
        cout << a << endl;
        cin>> i >> j;
    }
    return 0;
}