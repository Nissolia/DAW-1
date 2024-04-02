#include <iostream>
using namespace std;
// Programa que imprima un menú y el usuario pueda elegir que tabla de multiplicar mostrar
// por pantalla.
int main() {
    int num;
    do{
        cout<<"\t\tElige tu tabla de multiplicar: ";
        cout<<"\n\tTabla del 0 ....................... 0 ";
        cout<<"\n\tTabla del 1 ....................... 1 ";
        cout<<"\n\tTabla del 2 ....................... 2 ";
        cout<<"\n\tTabla del 3 ....................... 3 ";
        cout<<"\n\tTabla del 4 ....................... 4 ";
        cout<<"\n\tTabla del 5 ....................... 5 ";
        cout<<"\n\tTabla del 6 ....................... 6 ";
        cout<<"\n\tTabla del 7 ....................... 7 ";
        cout<<"\n\tTabla del 8 ....................... 8 ";
        cout<<"\n\tTabla del 9 ....................... 9 ";
        cout<<"\n\tTabla del 10 ....................... 10 \n\t";
        cin>>num;
    } while (num < 0 || num > 11);

    



    for (int i = 0; i < 11; i++)
    {
        cout<<"\t"<<num<<" x "<<i<<" = "<<num*i<<"\n";
    }
    
    return 0;
}
