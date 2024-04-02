#include <iostream>
using namespace std;
// num si es par o impar

int main() {
    int num;

    cout<<"Introduce un numero: ";
    cin>>num;

    if ((num % 2) == 0){
        cout<<"El numero "<<num<<" es par.";
    }else if ((num % 2) == 1){
        cout<<"El numero "<<num<<" es impar.";
    }else{
        cout<<"No se que has metido, deja de liarla porfa.";
    }

    return 0;}