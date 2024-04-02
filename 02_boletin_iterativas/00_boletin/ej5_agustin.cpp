#include <iostream>
using namespace std;
/*Desarrolla el código de una aplicación que pida una cadena y un carácter por
teclado y muestra cuántas veces aparece un carácter concreto en la cadena.*/

int main(){
    char letra;
    string palabra;
    int contador=0;

    cout<<"\tIntroduzca una palabra o conjunto de letras: ";
    getline(cin, palabra);

    cout<<"\tIntroduzca la letra que desea comprobar si esta contenida en "<<palabra<<" :";
    cin>>letra;

    for(int i=0; i<=palabra.length(); i++){
        if((palabra[i]==letra) || (palabra[i]==letra + 32) || (palabra[i]==letra - 32)){
            contador ++;
        }
    }
    cout<<"\tEl numero de veces que aparece la letra "<<letra<<" es: "<<contador;

    return 0;
}