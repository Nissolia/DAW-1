// Desarrolla un programa que pida ingresar 2 números y luego escoger la operación que
// se quiere hacer con ellos desde un menú (1 Suma, 2 Resta, 3 Multiplicación, 4 División,
// 5 Cuadrado, 6 Cubo), luego reportar el resultado. [switch case, con menú bonito]

#include <iostream>
#include <math.h>

using namespace std;

int main () {
    int tipo;
    double num1, num2;

    //menu para elegir que vamos a hacer
    cout<<"\t\t- Elije el calculo que quieres hacer:\n";
    cout<<"\t\tSuma................................ 1\n";
    cout<<"\t\tResta............................... 2\n";
    cout<<"\t\tMultiplicacion...................... 3\n";
    cout<<"\t\tDivision............................ 4\n";
    cout<<"\t\tCuadrado............................ 5\n";
    cout<<"\t\tCubo................................ 6\n";
    cout<<"\t\tEleccion: ";
    cin>>tipo;

    // añadimos los numeros que vamos a usar para el programa
    cout<<"\t\tIngresa el primer numero: ";
    cin>>num1;
    cout<<"\t\tIngresa el segundo numero: ";
    cin>>num2;

    switch (tipo)
    {
    case 1:
        // suma
        cout<<"\t\t"<<num1<<" + "<<num2<<" = "<<num1 + num2<<"\n";
        break;

    case 2:
        // resta
        cout<<"\t\t"<<num1<<" - "<<num2<<" = "<<num1 - num2<<"\n";
        break;

    case 3:
        // multiplicacion
        cout<<"\t\t"<<num1<<" x "<<num2<<" = "<<num1 * num2<<"\n";
        break;

    case 4:
        // division
        cout<<"\t\t"<<num1<<" / "<<num2<<" = "<<num1 / num2<<"\n";
        break;

    case 5:
        // cuadrado
        cout<<"\t\t"<<num1<<" tiene como cuadrado "<<pow(num1,2)<<" \n\t\t"<<num2<<" tiene como cuadrado "<<pow(num2,2)<<"\n";
        break;

    case 6:
        // cubo
        cout<<"\t\t"<<num1<<" tiene como cubo "<<pow(num1,3)<<" \n\t\t"<<num2<<" tiene como cubo "<<pow(num2,3)<<"\n";
        break;
    
    default:
    //ponemos esta elección por si alguien la lia poniendo numeros
        cout<<"\t\t No tengo idea de que has hecho, pero la has liado.";
        break;
    }
    

    return 0;
    }