// Realice un programa que lea de la entrada estándar los siguientes datos de una persona:
// Edad: dato de tipo entero.
// Sexo: dato de tipo carácter.
// Altura en metros: dato de tipo real.
// Tras leer los datos, el programa debe mostrarlos en la salida estándar.
#include <iostream>
using namespace std;

int main() {
    int edad;
    string sexo;
    double altura;

    cout<<"Dime tu edad: ";
    cin>>edad;
    cout<<"Dime tu sexo: ";
    cin>>sexo;
    cout<<"Dime tu altura en metros (con un punto): ";
    cin>>altura;

    cout<<"Tienes "<<edad<<" años, eres "<<sexo<<" y mides "<<altura<<" metros.";

    return 0;
}