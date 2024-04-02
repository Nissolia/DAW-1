// 2- Crear un programa que pide una edad y luego evalúa si es mayor de edad o no lo es.
#include <iostream>

using namespace std;


int main () {
    int edad;

    cout<<"Introduce tus años y te diré si eres mayor de edad.\n";
    cin>>edad;
    
    if (edad>=18){
    cout<<"Eres mayor de edad.\n";
    }else{
        cout<<"Eres menor de edad.\n";
    }
    
    return 0;
    }
