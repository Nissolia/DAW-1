#include <iostream>

using namespace std;

int main () {
    int num;

//numero entero 5! (5*4...*1) desde 0 hasta N
    cout<<" CUARTA RONDA!!\n\n";

    cout<<"\tIntroduce un numero: ";
    cin>>num;

    num++;

while (num != 0 ){
    for (int i = 1; i < num; i++){
        cout<<i;

        if (i <= num)
        {
            cout<<" x ";
        }else{
            cout<<" ";
        }
        
    }
    cout<<"\n";
    num--;
}
    return 0;
}