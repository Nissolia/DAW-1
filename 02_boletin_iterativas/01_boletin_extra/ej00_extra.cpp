#include <iostream>
#include<stdlib.h>
#include <time.h>

using namespace std;
// Después el otro jugador deberá ir introduciendo números de 1 en 1.
// El programa le responderá automáticamente si es mayor, menor o igual. Así hasta que
// consiga adivinar el número.
// Cuando lo adivine deberá poner un mensaje especificando cuantas preguntas ha
// necesitado y finalizar.
int main() {
    int num, pc, contador = 0;
    srand(time(NULL));

    //numero random del ordenador
    pc = rand() % 101;

    do{
        //numero introducido por persona
        cout<<"\tDebes de adivinar el numero que saca el ordenador, el limite es 100: ";
        cin>>num;

        //hacemos un if comprobando que se cumpla lo que necesitamos
        if (num < pc){
            cout<<"\tEl numero introducido es menor que el del ordenador.\n\n";
        }else if (num > pc){
            cout<<"\tEl numero introducido es mayor que el del ordenador.\n\n";
        }else if(num == pc){
            cout<<"\tEl numero introducido es igual que el del ordenador, aleluya.\n\n";
        }else{
            cout<<"\tNo se como, pero la has liado.\n\n";
        }

        contador++;
    } while (pc != num);
    
    cout<<"\tHas necesitado "<<contador<<" intentos para adivinar el número.";

    return 0;
}
