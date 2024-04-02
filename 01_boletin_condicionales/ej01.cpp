// Haz un programa que nos permita calcular el área o perímetro de varias figuras
// (Triangulo, rectángulo, circulo, y cuadrado)

#include <iostream>
#include <cmath>

using namespace std;

int main () {
    int figura, lado1, lado2, lado3;
    double perimetro, semiperimetro, area;
    const double pi = 3.14159265359;  // valor de pi

    semiperimetro=0;
    perimetro=0;
    area=0;

    lado1=0;
    lado2=0;
    lado3=0;

    cout<<"Selecciona de que figura quieres hacer su perimetro y su area .\n";
    cout<<"1|Triangulo      2|Rectangulo      3|Circulo      4|Cuadrado.\n";
    cin>> figura;

    switch (figura){
    case 1:
        //calculos del triangulo
        cout<<"Dame el primer lado del triangulo.\n";
        cin>> lado1;
        cout<<"Dame el segundo lado del triangulo.\n";
        cin>> lado2;
        cout<<"Dame el último lado del triangulo.\n";
        cin>> lado3;

        //comprobamos que el triángulo se pueda calcular
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1) )
        {//calculamos el perímetro
        perimetro = lado1 + lado2 + lado3;

        //calculamos el semiperímetro que es necesario para calcular el área
        semiperimetro = perimetro / 2;

        //calculamos el area usando la formula de herón
        area = sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        //mostramos por pantalla ambos resultados
        cout<<"El perimetro del triangulo es "<<perimetro<<".\n";
        cout<<"El area del triangulo es "<<area<<".\n";
        }else{
            cout<<"El triangulo que has introducido no se puede calcular.\n";
        }
        
        break;

    case 2:
        //calculos del rectangulo
        cout<<"Dame el primer lado del rectangulo.\n";
        cin>> lado1;
        cout<<"Dame el segundo lado del rectangulo.\n";
        cin>> lado2;
        
        //calculamos el perimetro y el area del rectángulo
        perimetro = 2 * (lado1 + lado2);
        area = lado1 * lado2;

        //mostramos por pantalla ambos resultados
        cout<<"El perimetro del cuadrado es "<<perimetro<<".\n";
        cout<<"El area del cuadrado es "<<area<<".\n";
        break;

    case 3:
        //calculos del circulo
        cout<<"Dame el radio del circulo.\n";
        cin>> lado1;
        
        //calculamos el perimetro y el area del circulo
        perimetro = 2 * pi * lado1;
        area = pi * lado1 * lado1;

        //mostramos por pantalla ambos resultados
        cout<<"El perimetro del circulo es "<<perimetro<<".\n";
        cout<<"El area del circulo es "<<area<<".\n";
        break;

    case 4:
        //calculos del cuadrado
        cout<<"Dame el lado del cuadrado.\n";
        cin>> lado1;

        //calculamos el perimetro y el area del circulo
        perimetro = lado1 + lado1 + lado1 + lado1;
        area = lado1 * lado1;

        //mostramos por pantalla ambos resultados
        cout<<"El perimetro del circulo es "<<perimetro<<".\n";
        cout<<"El area del circulo es "<<area<<".\n";
        break;
    
    default:
        cout<<"No has introducido correctamente el numero correspondiente.\n";
        break;
    }
    
    return 0;}