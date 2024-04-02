// Crear un programa que me pida el nombre, la edad y la población y me muestre
// esos datos
#include <iostream>
using namespace std;

int main() {
    int edad;
    string pueblo, nombre;

    cout<<"\tDime el pueblo al que perteneces: ";
    getline(cin, pueblo);
    cout<<"\tDime tu nombre: ";
    cin>>nombre;
    cout<<"\tDime tu edad: ";
    cin>>edad;
    

    cout<<"\tTe llamas "<<nombre<<" tienes "<<edad<<" edad y perteneces a "<<pueblo<<"\n";


    return 0;
}
