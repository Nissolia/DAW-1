//includes de mi aplicacion
#include <iostream>

using namespace std;
/*
*   Funcion que suma dos numeros
*   Entrada: num1 y num2
*   Salida: la suma de ambos números
*/
double suma(double num1, double num2){
    return num1 + num2;
}

/*
* Funcion que pide dos numeros y los saca por pantalla sumados
* Entrada: ninguna
*/
void datos(){
    double num1, num2;

    cout<<"\tIntroduce dos numeros: \n";
    cin>>num1>>num2;

    cout<<"\tLa suma de "<<num1<<" y "<<num2<<" es: "<<suma(num1, num2)<<"\n";

    cout<<"Quieres volver a sumar dos numeros? \n1 - Si \nCualquier num - No: ";
    int elecc;
    cin>>elecc;

    if (elecc == 1){
        datos();
    }else{
        cout<<"Adios.";
    }
}