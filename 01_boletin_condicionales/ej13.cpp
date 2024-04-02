// Que muestre un menú donde las tipoes sean “Equilátero”, “Isósceles” y “Escaleno”,
// pida una opción y calcule el perímetro del triángulo seleccionado.

#include <iostream>

using namespace std;

int main () {
    int lado1, lado2, lado3, tipo;
    double perimetro;


    cout<<"\t\tElije el triangulo deseado:\n\n";
    cout<<"\t\tEquilatero........................... 1\n";
    cout<<"\t\tIsosceles............................ 2\n";
    cout<<"\t\tEscaleno............................. 3\n";
    cin>>tipo;


    if (tipo == 1) {
        // Triángulo Equilátero
        cout << "Ingresa la longitud de un lado del triangulo equilatero: \n";
        cin >> lado1;
        perimetro = 3 * lado1;

        cout << "El perímetro del triangulo es: " << perimetro << "\n";
    } else if (tipo == 2) {
        // Triángulo Isósceles
        cout << "Ingresa la longitud del primer lado: \n";
        cin >> lado1;
        cout << "Ingresa la longitud del segundo lado: ";
        cin >> lado2;
        perimetro = 2 * lado1 + lado2;

        cout << "El perímetro del triangulo es: " << perimetro << "\n";
    }else if (tipo == 3) {
        // Triángulo Isósceles
        cout << "Ingresa la longitud del primer lado: \n";
        cin >> lado1;
        cout << "Ingresa la longitud del segundo lado: \n";
        cin >> lado2;
        cout << "Ingresa la longitud del tercer lado: \n";
        cin >> lado3;
        perimetro = lado1 + lado2 + lado3;

        cout << "El perímetro del triangulo es: " << perimetro << "\n";
    } else {
        // Triángulo Escaleno
        cout << "Has introducido mal los numeros.\n";
    }   

    return 0;
    }