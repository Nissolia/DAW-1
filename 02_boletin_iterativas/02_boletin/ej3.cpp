// Crear un programa que me pida tu año de nacimiento y calcule tu edad
#include <iostream>
using namespace std;

int main() {
    int edad, actual;

    cout<<"Introduce el año actual: ";
    cin>>actual;
    cout<<"Di tu anio de nacimiento: ";
    cin>>edad;

    cout<<"Tienes "<<actual-edad<<" anios.";

    return 0;
}
