// Crear un programa que pregunte por los pesos
// de dos objetos peso1 y peso2, el
// programa debe indicar si el peso1 representa
// la cuarta parte del peso2 para decir que
// cumple con la especificación y de no ser así
// rechazar los objetos.

#include <iostream>

using namespace std;

int main () {
    int peso1;
    int peso2;

    cout<<"Introduce el primer peso.\n";
    cin>>peso1;

    cout<<"Introduce el segundo peso.\n";
    cin>>peso2;

    if (peso2/4 == peso1){
        cout<<"El primer peso es una cuarta parte del segundo.\n.";
    }else{
        cout<<"El primer peso NO es una cuarta parte del segundo.\n.";
    }

    
    
    return 0;
    }