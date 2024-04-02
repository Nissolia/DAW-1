// Crear un programa Pida por teclado una cantidad en pesetas, Calcule su equivalente
// en euros, Muestre por pantalla el resultado.
#include <iostream>
using namespace std;

double peseta(double num1, double num2);
double euro(double num1, double num2);

int main() {
    double pesetas = 0, euros = 0;
    int eleccion;

    cout<<"\n\tElige que quieres convertir:\n\t1| Pesetas\t2| Euros\n\t";
    cin>>eleccion;

    switch (eleccion){
    case 1:
        cout<<"\n\tElegiste convertir Pesetas a Euros\n\t";
        cin>>pesetas;

        cout<<"\n\tTienes "<<peseta(pesetas, euros)<<" Euros.\n";
        break;

    case 2:
        cout<<"\n\tElegiste convertir Euros a Pesetas\n\t";
        cin>>euros;

        cout<<"\n\tTienes "<<euro(euros, pesetas)<<" Pesetas.\n";
        break;
    
    default:
    cout<<"\tHas introducido mal el numero.";
        break;
    }
    
    cout<<"\t";

    return 0;
}

double peseta(double num1, double num2){
   num2 = num1*0.006;
   return num2;
}

double euro(double num1, double num2){
   num2 = num1*166;
   return num2;
}