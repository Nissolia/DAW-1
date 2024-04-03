#include <iostream>
#include "cuentas.hpp"

using namespace std;


int main () {
    int edad;
    int fNacimiento;

    cout<<"Introduce tu agno de nacimiento y te dire tu edad.\n";
    cin>>fNacimiento;
    edad<<(2023 - fNacimiento);
    cout<<"Tienes"<<edad<<"años.\n";

   
    return 0;
}