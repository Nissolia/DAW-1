#include <iostream>
using namespace std;
// Programa que convierta de grados Fahrenheit a grados Celsius.
int main() {
    int respuesta;
    double num;

    cout<<"\tConversiones: \n\t\t1|Fahrenheit\t2|Celsius: ";
    cin>>respuesta;

    switch (respuesta)
    {
    case 1:
        cout<<"\tElegiste de Fahrenheit a Celsius, aniade el numero: ";
        cin>>num;

        cout<<"\t"<<num<<" Fahrenheit son "<<(num - 32) * 5/9<<" Celsius.\n";
        break;
    case 2:
        cout<<"\tElegiste de Celsius a Fahrenheit, aniade el numero: ";
        cin>>num;

        cout<<"\t"<<num<<" Celsius son "<<(num * 9/5) + 32<<" Fahrenheit.\n";
        break;
    default:
        cout<<"\tNi idea de lo que has hecho.";
        break;
    }

    return 0;
}
