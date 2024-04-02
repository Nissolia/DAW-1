#include <iostream>
#include <math.h>
using namespace std;
// Crear un programa que permita calcular el cubo de un número real
int main() {
    int num, elevado;
    
    cout<<"\tDime un numero y te digo el cubo: ";
    cin>>num;

    elevado = pow(num, 3);
    cout<<"\tDel numero "<<num<<" el cuadrado es: "<<elevado;

    return 0;
}