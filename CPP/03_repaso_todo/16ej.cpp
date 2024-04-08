#include <iostream>
#include <ctime>
using namespace std;
/*************************** EJERCICIO 7 Y MEDIA ***************************/
/* Cree el juego de las 7 y media. El ordenador hará de banco
   que irá dando cartas. Los valores posibles son del 1, 2, 3, 4, 5, 6, 7,
   10, 11 y 12. Del 1 al 7 tienen su valor. Cuando salga 10,11 y 12 se
   obtendrá medio punto. */

/* Gana el jugador que se haya acercado más a 7 y medio.
 Se pueden hacer distintos modos de juegos, que cada
 uno elija:
 Máquina contra humano.
 Humano vs humano.
 Más de dos jugadores. */

/*************************** CONSTANTES ****************************/
const int cartas[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
/**************************** FUNCIONES ****************************/
void maquinaVSPersona();
/******************************* MAIN *******************************/
int main()
{
    maquinaVSPersona();
    /* valores posibles son del 1, 2, 3, 4, 5, 6, 7,
       10, 11 y 12. Del 1 al 7 tienen su valor. Cuando salga 10,11 y 12 se
       obtendrá medio punto. */

    /* Gana quien saca 7 y medio, no se pasa y está mas cerca */

    /* MODOS DE JUEGO        */
    /* Máquina contra humano.
       Humano vs humano.
      Más de dos jugadores. */

    return 0;
}
/* MAQUINA CONTRA HUMANO*/
void maquinaVSPersona()
{
    char elecc;
    int numCartaPersona, numCartaPc;
    double auxPersona = 0.0, auxPc = 0.0, diferencia = 0.0;
    srand(time(NULL));

    cout << "\tQuieres sacar una carta?\ts/n: ";
    cin >> elecc;
    do
    {
        // Se muestran las cartas que saca la persona
        numCartaPersona = cartas[rand() % 10];
        if (numCartaPersona > 10)
        {
            auxPersona += 0.5;
        }
        else
        {
            auxPersona += numCartaPersona;
        }
        // Se muestran las cartas que saca la maquina
        numCartaPc = cartas[rand() % 10];
        if (numCartaPc > 10)
        {
            auxPc += 0.5;
        }
        else
        {
            auxPc += numCartaPc;
        }

        cout << "\tHas sacado un " << numCartaPersona << endl
             << "\tLa maquina ha sacado " << numCartaPc << endl
             << endl;
        cout << "\tQuieres sacar otra carta?\ts/n: ";
        cin >> elecc;
    } while (elecc == 's');
    cout << endl;
    // Parte en la que ambos pierden o la persona pierde o la máquina
    if (auxPc > 7.5 && auxPersona > 7.5)
    {
        cout << "\tHas perdido de manera automatica, con " << auxPersona << " puntos.";
    }
    else if (auxPc > 7.5)
    {
        cout << "\tHas ganado de manera automatica, porque la maquina ha sacado " << auxPc << " puntos.";
    }
    else if (auxPersona > 7.5)
    {
        cout << "\tLos dos habeis perdido, enhorabuena..." << endl
             << "\tLa maquina obtuvo " << auxPersona << " puntos." << endl
             << "\tTu obtuviste " << auxPersona << " puntos.";
    }
    else
    {
        // Ninguno pierde entonces hay que ver quien esta mas cerca
        
        diferencia = auxPersona - auxPc;
        // delante si va el peque con -
        if (diferencia < 0) // si es negativo
        {
            cout << "La maquina ha ganado por una diferencia de " << auxPc - auxPersona << " puntos."<< endl
                 << "\tLa maquina obtuvo " << auxPersona << " puntos." << endl
                 << "\tTu obtuviste " << auxPersona << " puntos.";
        }
        else
        {
            cout << "Has ganado por una diferencia de " << auxPersona - auxPc << " puntos."<< endl
                 << "\tLa maquina obtuvo " << auxPersona << " puntos." << endl
                 << "\tTu obtuviste " << auxPersona << " puntos.";
            
        }

        
    }
}