#include <iostream>
#include <cmath>
using namespace std;
// Hacer un programa en C++ que permita sumar la sucesión de los números 2^1+2^2+...+2^n,
// siendo n un número que se ingresa por medio del teclado.
int main() {
    int num = 0, suma = 0;

    while (num < 1){
        cout<<"\t\tIntroduce un numero: ";
        cin>>num;
    }

    for (int i = 1; i <= num; i++)
    {
        
        suma = suma + pow(2, i);
        cout<<"\t"<<2<<" ^ "<<i<<" = "<<suma;
        cout<<" . . . . . . . . Suma total: "<<suma<<"\n";
        
    }
cout<<"\n";
    return 0;
}
