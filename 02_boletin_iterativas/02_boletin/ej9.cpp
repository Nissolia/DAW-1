#include <iostream>
using namespace std;
// Desarrolla un programa que me pida dos números y me calcule las 4 operaciones
// matemáticas. (Intenta hacerlo usando funciones tanto que estén en el mismo
// fichero.cpp como en una librería externa)
double suma(double num1, double num2);
double resta(double num1, double num2);
double multiplicacion(double num1, double num2);
double division(double num1, double num2);

int main() {
    double num1, num2, aux = 0;
    int eleccion;

    do{
       cout<<"\t1|Suma    2|Resta    3|Multiplicacion    4|Division    ";
        cin>>eleccion;
    } while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4);
    
    
    switch (eleccion){
    case 1:
    cout<<"\tElige tu primer y segundo numero:\n";
    cin>>num1>>num2;
        cout<<num1<<" + "<<num2<<" = "<<suma(num1, num2);
        break;

    case 2:
    cout<<"\tElige tu primer y segundo numero:\n";
    cin>>num1>>num2;
        cout<<num1<<" - "<<num2<<" = "<<resta(num1, num2);
        break;

    case 3:
    cout<<"\tElige tu primer y segundo numero:\n";
    cin>>num1>>num2;

        aux = multiplicacion(num1, num2);
        if (aux == 0 || aux == -0){
            cout<<num1<<" x "<<num2<<" = 0";
        }else{
            cout<<num1<<" x "<<num2<<" = "<<multiplicacion(num1, num2);
        }
        break;

    case 4:
    cout<<"\tElige tu primer y segundo numero:\n";
    cin>>num1>>num2;
        
        aux = division(num1, num2);
        if (aux == 0 || aux == -0){
            cout<<num1<<" / "<<num2<<" = 0";
        }else{
            cout<<num1<<" / "<<num2<<" = "<<division(num1, num2);
        }
        break;
    
    default:
    cout<<"Has introducido mal los numeros...";
        break;
    }

    

    return 0;
}

//funciones
double suma(double num1, double num2){
    return num1 + num2;
}
double resta(double num1, double num2){
    return num1 - num2;
}
double multiplicacion(double num1, double num2){
    return num1 * num2;
}
double division(double num1, double num2){
    return num1 / num2;
}