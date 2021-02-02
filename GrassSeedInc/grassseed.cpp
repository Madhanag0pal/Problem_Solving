#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
    double c,a=0;
    cin >> c;
    if (0 < c && c <= 100){
        int l;
        cin >> l;
        if(0 < l && l <= 100){
            for(int i=0;i < l;i++){
                double l,b;
                cin >> l >> b;
                // if((0<l && l<=100) && (0<b && b <= 100))
                a += l*b;
            }
        }
        printf("%0.7f",a*c);
    }
}