#include <iostream> 

using namespace std;

// Desarrolla un programa en el que introduzcas una palabra y te diga cuantas
// letras la componen. [investiga la propiedad .size()]
int main() {
    string palabra;

    cout<<"Ingresa una palabra: ";
    cin>>palabra;


    int longitud = palabra.size();

    cout<<"la palabra "<<palabra<<" contiene "<<longitud<<" letras.";
    return 0;
}
