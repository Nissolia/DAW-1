#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;
// maquina contra jugador
int main() {
    int jugador, pc;
    int puntoJugador = 0;
    int puntoPc = 0;

    srand(time(NULL));

while (puntoJugador < 5 && puntoPc < 5){
    //numero random del ordenador
        pc = rand() % 101;
        
        //numero introducido por persona
        cout<<"\tDebes de adivinar el numero que saca el ordenador, el limite es 100: ";
        cin>>jugador;

        if(pc == jugador){
            puntoJugador++;
            cout<<puntoJugador;
            cout<<"\tHas ganado a una maquina.\n\n";
        }else{
            puntoPc++;
            cout<<puntoPc;
            cout<<"\tTe ha ganado una maquina.\n\n";
        }
}
    
    if (puntoPc == 5){
        cout<<"\tTe ha ganado una maquina, ha acabado con tus 5 vidas.\n";
    }else if(puntoJugador == 5){
        cout<<"\tHas acabado con la maquina, ni tan mal.\n";
    }

    return 0;
}
