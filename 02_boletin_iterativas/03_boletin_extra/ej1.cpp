#include <iostream>
using namespace std;
// Cree un programa que introduciendo un número muestre
// su correspondiente carácter de la tabla ASCI.
int main() {
    int num, respuesta;

    do{
    cout<<"\tIntroduce un numero y te digo su equivalente en la tabla ASCII: ";
    cin>>num;

    cout<<"\tElegiste el caracter: "<<char(num);

        cout<<"\n\tPon un 0 si quieres parar: ";
        cin>>respuesta;
        cout<<"\n";
    } while (respuesta != 0);
    
    return 0;
}
