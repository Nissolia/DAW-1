#include <iostream>
using namespace std;
// Crear un programa que permita leer el valor correspondiente a una distancia en
// kilómetros y las visualice expresadas en metros
int main() {
    double km;

    cout<<"\tDime la distancia en kilometros y las convierto en metros: ";
    cin>>km;

    cout<<"\t"<<km<<" km, son "<<km*1000<<" metros.";


    return 0;
}
