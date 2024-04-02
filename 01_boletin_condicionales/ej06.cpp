// Desarrollar un programa que pide tres números enteros y luego evalúa si la
// multiplicación de los dos primeros es igual al tercero.

#include <iostream>

using namespace std;

int main () {
    int num1, num2, num3;

    cout<<"Te pediré 3 numeros y evaluaremos si la multiplicacion de los dos primeros es igual al tercero.\n";
    
    cout<<"Introduce el primer numero.\n";
    cin>>num1;
    cout<<"Introduce el segundo numero.\n";
    cin>>num2;
    cout<<"Introduce el tercer numero.\n";
    cin>>num3;

    if (num1 * num2 == num3){
        cout<<"Perfecto, la multiplicacion de los dos primeros primeros es igual al tercero.\n";
    }else{
        cout<<"Pues muy bonitos numeros.\n";
    }
        
    return 0;
    }