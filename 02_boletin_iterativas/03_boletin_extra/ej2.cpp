#include <iostream>
using namespace std;
// Cree un programa que introduciendo un carácter de la
//tabla ASCI devuelva su valor numérico.
int main() {
    int respuesta;
    char simbolo;

    do{
    cout<<"\tIntroduce un caracter y te digo su equivalente en la tabla ASCII: ";
    cin>>simbolo;

    cout<<"\tElegiste el valor numerico: "<<int(simbolo);

        cout<<"\n\tPon un 0 si quieres parar, si no un numero cualquiera: ";
        cin>>respuesta;
        cout<<"\n";
    } while (respuesta != 0);
    
    return 0;
}
