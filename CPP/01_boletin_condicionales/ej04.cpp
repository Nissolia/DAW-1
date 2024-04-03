// Crear un programa que pide y luego evalúa si dicho número es positivo, negativo o
// neutro. Y después diga si es par o impar.

#include <iostream>
#include <cmath>

using namespace std;

int main () {
    int numero;

    cout<<"Dame un numero y te digo si es positivo, negativo o neutro.\n Despues calcularemos si es par o impar.\n";
    cin>>numero;
    
    // Comprobamos si los numeros son negativos, positivos o neutros
    if (numero<0){
        cout<<"El numero que has introducido es negativo.\n";
    }else if(numero>0){
        cout<<"El numero que has introducido es positivo.\n";
    }else{
        cout<<"El numero que has introducido es neutro.\n";
    }

    // Comprobamos si es un numero par o impar
    if (numero % 2 == 0){
        cout<<"El numero que has introducido es par.\n";
    }else{
        cout<<"El numero que has introducido es impar.\n";
    }
    
    return 0;
    }