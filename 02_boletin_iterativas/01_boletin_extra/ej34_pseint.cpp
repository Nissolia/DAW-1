#include <iostream>
using namespace std;
// piramide invertida

int main() {
    int altura, contador = 0;

    cout<<"Altura de la piramide: ";
    cin>>altura;

    for (int i = 0; i < altura; i++){
        // espacios en blanco de los asteriscos
        
        for (int j = 0; j < i; j++){
            // se deben de "comparar" con el contador
            cout << " ";
        }

        // asteriscos en orden descendente
        for (int k = i; k < altura; k++){
            cout << "* ";
        }
        
        cout<<"\n";
    }
   
    return 0;}