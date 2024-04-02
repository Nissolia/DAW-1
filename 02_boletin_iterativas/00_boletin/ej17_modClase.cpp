//Desarrolla un programa que permita introducir una palabra y el programa
// invierta el orden de las letras de la palabra

#include <iostream>
#include <string.h>

using namespace std;

int main() {
    string frase;

    cout<<"Introduce tu cadena de caracteres: ";
    getline(cin, frase);

    cout<<"Te voy a invertir los caracteres: \n";

    int largo = frase.size();

    string fraseFinal = "";
    
    for (int i = largo; i >= 0; i--)
    {
        fraseFinal += frase [i];
        
    }
    cout<<"La palabra es "<<fraseFinal;
    
    return 0;
}
