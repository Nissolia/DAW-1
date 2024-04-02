#include <iostream> 

using namespace std;
// Pedir un número por pantalla (un número menor que 10) y visualizar por
// pantalla su tabla de multiplicar.
int main() {
    int num, multi = 0;

    do{
        cout<<"Dime el tope: ";
            cin>>multi;
    } while (multi <= 0 || multi >= 11);

    cout<<"Introduce el numero que necesitamos: ";
    cin>>num;

    for (int i = 0; i <= multi; i++){
        cout<<num<<" x "<<i<<" = "<<num * i<<"\n";}

    return 0;
}