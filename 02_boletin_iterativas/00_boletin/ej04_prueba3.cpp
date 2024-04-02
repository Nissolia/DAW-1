#include <iostream> 

using namespace std;

// Un programa que le introduzcas 4 números por teclado y los imprima en orden
// de mayor a menor.
int main() {
    int num = 0, numHelp;
    
    int primero = 0;
    int segundo = 0;
    int tercero = 0;
    int cuarto = 0;
    
    
    for (int i = 0; i < 4; i++)
    {
        do{
        cout<<"Introduce un numero para ponerlos de mayor a menor: ";
        cin>>num;
        } while (num <= 0);

        if (num >= primero){
            cuarto = tercero;
            tercero = segundo;
            segundo = primero;
            primero = num;
        } else if (num >= segundo){
            cuarto = tercero;
            tercero = segundo;
            segundo = num;
        } else if (num >= tercero){
            cuarto = tercero;
            tercero = num;
        } else if (num >= cuarto){
            cuarto = num;
        }
    }

    cout<<primero<<"  "<<segundo<<"  "<<tercero<<"  "<<cuarto;

    return 0;
}
