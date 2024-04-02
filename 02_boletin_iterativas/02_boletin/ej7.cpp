#include <iostream>
using namespace std;
// Intercambiar el valor de dos números, introducidos por teclado
int main() {
    int num1, num2, num3 = 0;

    cout<<"Introduce el primer valor: ";
    cin>>num1;
    cout<<"Introduce el segundo valor: ";
    cin>>num2;

    num3 = num1;
    num1 = num2;
    num2 = num3;

    cout<<"Ahora el primer valor es "<<num1<<" y el segundo es "<<num2;


    return 0;
}
