// Crear un programa que pida dos números, luego
// calcule el promedio y muestre un
// mensaje según el promedio obtenido de acuerdo al
// rango de datos del siguiente cuadro:
// <0,5] Categoría Alfa
// <5,10] Categoría Beta
// <10,13] Categoría Gama
// <13,16] Categoría Delta
// <16,20] Categoría Epsilon

#include <iostream>

using namespace std;

int main () {
    double num1;
    double num2;
    double media;

    cout<<"Introduce el primer número para calcular el promedio.\n";
    cin>>num1;
    cout<<"Introduce el segundo número para calcular el promedio.\n";
    cin>>num2;

    media=(num1+num2)/2;

    if (media = 0,5)
    {
        cout<<"Estás en la categoría Alfa.\n";
    }else if (media>0 && media<=5){
        cout<<"Estás en la categoría Beta.\n";
    }else if (media>10 && media<=13){
        cout<<"Estás en la categoría Gama.\n";
    }else if (media> 13 && media<=16){
        cout<<"Estás en la categoría Delta.\n";
    }else if (media> 16 && media<=20){
        cout<<"Estás en la categoría Epsilon.\n";
    }else{
        cout<<"No ha entrado en ninguna categoría.\n";
    }
    

    
    return 0;
    }