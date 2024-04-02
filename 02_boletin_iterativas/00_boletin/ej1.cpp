// Introducir un número por teclado y tu nombre y mostrar tu nombre por
// pantalla tantas veces como indique dicho número.

#include <iostream>

using namespace std;

int main () {
    int veces;
    char nombre[30]; //se pone 30 como máximo de caracteres

    //el usuario debe introducir su nombre y las veces que quiere ver el nombre por pantalla
    cout<<"\tDime tu nombre: ";
    cin>>nombre;
    cout<<"\tDime el numero de veces que quieres ver tu nombre por pantalla: ";
    cin>>veces;
    
    //las veces que se imprimirá por pantalla el texto que hemos añadido
    while (veces > 0){
        veces--;
        cout<<"\t"<<nombre<<" \n";
    }
    
    return 0;
}