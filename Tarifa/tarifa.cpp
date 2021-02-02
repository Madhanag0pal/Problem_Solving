#include <iostream>
using namespace std;

int main(){
    int x,n,p;
    cin >> x >> n;
    int bl = x;
    for(int i=0;i < n;i++){
        cin >> p;
        bl += x-p;
    }
    cout << bl;
}