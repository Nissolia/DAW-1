#include <iostream>
using namespace std;
// Introduciremos 5 valores por teclado, el programa debe decidir cual de ellos es
// mayor.
int main() {
    int num, mayor = 0;

    for (int i = 0; i < 5; i++){
        cout<<"Introduce un numero por teclado para ver el mayor: ";
        cin>>num;

        if (num > mayor){
            mayor = num;
        }
        
    }
    cout<<"\nEl numero mas grande introducido por pantalla es: "<<mayor;
    
    return 0;
}
