#include <cmath>
#include <iostream>
#include "cuentas.hpp"

using namespace std;

    

int main () {
    int num1;
    int num2 = 0;

    cout<<"Vamos a sumar varios numeros.\n";
    
    if (num1==0){
        cout<<"El resultado es: "<<num2;
    }
        num2 = num1+num2;
        cout<<"Escribe un numero, cuando escribas 0 dejare de hacer la cuenta.";
        cin>>num2;
    
    
    return 0;
}