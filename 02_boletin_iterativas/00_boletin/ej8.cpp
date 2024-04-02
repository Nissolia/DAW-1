#include <iostream> 

using namespace std;

// Crea un programa que imprime en pantalla tantos números pares como se le
// indique desde el teclado, empezando por el número 2, y finalmente los sume
// todos

int main() {
    int num, suma = 0, mostrar =2;

    cout<<"Agnade los numeros pares que quieres ver por teclado: ";
    cin>>num;
    
    for (int i = 0; i < num; i++){ //se desarrolla mientras "i < num"
        cout<<mostrar<<"  ";
        suma=mostrar+suma;
        mostrar=mostrar+2;
        }

    cout<<"\n\t"<<suma<<" es la suma total.";

    return 0;
}
