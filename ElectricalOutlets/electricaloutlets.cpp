#include<iostream>
using namespace std;

int main(){
    int n,k;
    cin >> n;
    while(n--){
        cin >> k;
        int sum = 0,x;
        while(k--){
            cin >> x;
            sum += x-1;
        }
        cout << sum+1 << endl;
    }
    return 0;
}