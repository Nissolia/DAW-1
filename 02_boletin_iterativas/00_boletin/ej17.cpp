//Desarrolla un programa que permita introducir una palabra y el programa
// invierta el orden de las letras de la palabra

#include <iostream>
#include <string.h>

using namespace std;

int main() {
    string frase;

    cout<<"Introduce tu cadena de caracteres: ";
    cin>>frase;

    cout<<"Te voy a invertir los caracteres: \n";

    int largo = frase.size();

    cout<<"La palabra es : ";
    
    for (int i = largo; i >= 0; i--)
    {
        cout<<frase[i];
        // char temp = frase[i];
        // frase[i] = frase[largo - 1];
        // frase[largo - 1] = temp;
        
    }
        // cout<<"La palabra es "<<frase;
    
    return 0;
}
