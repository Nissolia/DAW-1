#include <iostream>
using namespace std;

int main() {
    double practicas, teorica, participacion;

do{
    cout<<"\n\tDime la nota de las practicas: ";
    cin>>practicas;
    cout<<"\tDime la nota de la teoria: ";
    cin>>teorica;
    cout<<"\tDime la nota de la participacion: ";
    cin>>participacion;
} while (practicas < 0 || practicas > 10 || teorica < 0 || teorica > 10 || participacion < 0 || participacion > 10 );

    cout<<"\n\tLas practicas dan: "<<practicas*0.3<<"\n";
    cout<<"\tLa teoria da: "<<teorica*0.6<<"\n";
    cout<<"\tLa participacion da: "<<participacion*0.1<<"\n\n";

    cout<<"\tTendras "<<(practicas*0.3)+(teorica*0.6)+(participacion*0.1)<<" como nota final.\n\n";

    return 0;
}