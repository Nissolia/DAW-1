//11- Este programa pide primero la cantidad total de compras de una persona. Si la cantidad
//es inferior a 100€, el programa dirá que el cliente no aplica a la promoción. Pero si la
//persona ingresa una cantidad en compras igual o superior a 100€, el programa genera de
//forma aleatoria un número entero del cero al cinco.
// Si sale 0 no tendrá descuento, si sale 1 tendrá un 10% de descuento, si sale 2 un 20%...
// de manera que el programa mostrará un nuevo valor a pagar luego de haber aplicado el descuento.

#include <iostream>
#include <ctime>

using namespace std;

int main () {
    // Inicia el generador de números aleatorios
    srand (time(NULL));
    double gastado;
    int random;

    cout<<"Dime lo que te has gastado: ";
    cin>>gastado;
    
    if (gastado>=100){
        // Obtención de un número aleatorio entre cero y otro valor
        random = rand() % 6;
        
            if (random == 0){
                cout<<"No se te aplica ningun descuento.\n";
            }else{
                cout<<"Tienes un "<<random*10<<" porciento.\n";
            // Hacemos los calculos mientras los mostramos por pantalla
                cout<<"Has ahorrado "<<(random * gastado)/10<<" euros"".\n";
                cout<<"Tienes que pagar "<<(gastado-(random * gastado)/10)<<" euros"".\n";
            }
        
    }else if( gastado>=0 && gastado<100 ){
        cout<<"Apoquina con lo que te has gastado.\n";

    }else {
        cout<<"¿Cómo vas a deber dinero, parguela?\n";
    }
    
    return 0;
    }