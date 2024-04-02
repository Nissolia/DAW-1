#include <iostream>
using namespace std;
// Desarrolla el código de una aplicación que pida una cadena y un carácter por
// teclado y muestra cuántas veces aparece un carácter concreto en la cadena.

int main() {
    string frase;
    char letra;

    cout<<"Introduce tu cadena de caracteres: ";
    cin>>frase;

    cout<<"Introduce la letra que quieres ver las veces que se repite: ";
    cin>>letra;

    int longitud = frase.size();
    //mostrar lo que ha metido el usuario y la longitud
    cout<<"De tu cadena de caracteres "<<frase<<" de longitud "<<longitud<<"\n";

    //hacerlo para ver con 'A' a 'Z'
    
    
    
    

    return 0;
}
