#include <iostream>
#include <ctime>
#include <fstream>
#include <cctype>
/****** BIBLIOTECAS ******/
using namespace std;
/************* FUNCIONES *************/
void juego();
/*************** MAIN ****************/
int main()
{
    int TotalPartidas, TotalGanadasUser, TotalPerdidasUser;
    srand(time(NULL));
    /** FUNCION EN LA QUE SE GUARDAN LOS DATOS **/
    juego();

    
    /* AÑADIR TXT CON HISTORICO DE DADOS, */
    /* se lee el txt preestablecido y se sobreescribe - hacer una funcion para eso */
    /** COMO SE VE EL DOCUMENTO DE HISTORIAL DE PARTIDAS **/
    // TotalPartidas 0
    // TotalGanadasUser 0
    // TotalPerdidasUser 0
    // meter un txt nuevo en el que se van sumando las partidas totales que se han hecho, se lee primero y luego se sobreescribe

    return 0;
}
/*
Funcion en la que hacemos que el jugador saque dos "dados" y juegue contra la maquina
Debe acertar si su numero es mayor, menor o igual al de la maquina, si acierta gana
Entrada y salida ninguna
*/
void juego()
{
    int dados[6] = {1, 2, 3, 4, 5, 6}, dado1, dado2, sumaPc = 0, sumaU = 0;
    string apuesta;

    cout << "\n\tVamos a jugar con los dados... \n\n";
    /** ABRIMOS ARCHIVO **/
    ofstream archivo; // Para escribir en el texto

    archivo.open("00Ex_historialDados.txt", ios::app); // para sobreescribir sin borrar nada anteriormente

    srand(time(NULL));
    /******************* DADOS JUGADOR *******************/
    cout << "Tus dados son: ";
    dado1 = dados[rand() % 6];
    dado2 = dados[rand() % 6];
    cout << dado1 << " " << dado2;
    /******************* SUMA DADOS USER *******************/
    sumaU = dado1 + dado2;
    cout << endl
         << "La suma de tus dados es: " << sumaU << endl;
    /* Escribimos en el archivo lo del usuario*/
    archivo << "Persona: " << dado1 << ", " << dado2 << " | Suma dados: " << sumaU << endl;
    /******************* APUESTA QUE HACE EL JUGADOR *******************/
    do
    {
        cout << "\n\tTu suma es mayor, menor o igual a la de tu adversario? ";
        cin >> apuesta;
    } while (apuesta != "mayor" && apuesta != "menor" && apuesta != "igual");

    /******************* DADOS PC *******************/
    cout << endl
         << "Los dados del ordenador son: ";
    dado1 = dados[rand() % 6];
    dado2 = dados[rand() % 6];
    cout << dado1 << " " << dado2;
    /******************* SUMA DADOS PC *******************/
    sumaPc = dado1 + dado2;
    cout << endl
         << "La suma de tus dados es: " << sumaPc << endl;
    /* Escribimos en el archivo lo del ordenador*/
    archivo << "Maquina: " << dado1 << ", " << dado2 << " | Suma dados: " << sumaPc << endl;

    /************************************ APUESTA Y COMPROBACIÓN ************************************/
    if (apuesta == "mayor")
    {
        if (sumaU > sumaPc)
        {
            cout << endl
                 << "Exacto, has ganado con una diferencia de " << sumaU - sumaPc << endl;
            archivo << "Persona gana a pc " << endl;
        }
        else
        {
            cout << endl
                 << "Ra no esta de tu lado" << endl;
            archivo << "Persona pierde contra pc " << endl;
        }
    }
    else if (apuesta == "menor")
    {
        if (sumaU < sumaPc)
        {
            cout << endl
                 << "Exacto, has ganado con una diferencia de " << sumaPc - sumaU << endl;
            archivo << "Persona gana a pc " << endl;
        }
        else
        {
            cout << endl
                 << "Ra no esta de tu lado" << endl;
            archivo << "Persona pierde contra pc " << endl;
        }
    }
    else if (apuesta == "igual")
    {
        if (sumaU == sumaPc)
        {
            cout << endl
                 << "Exacto, has logrado empatar " << endl;
            archivo << "Habeis empatado" << endl;
        }
        else
        {
            cout << endl
                 << "Ra no esta de tu lado" << endl;
            archivo << "Persona pierde contra pc " << endl;
        }
    }
    else
    {
        cout << "Has introducido mal los numeros...";
        archivo << "Mala introduccion de datos" << endl;
    }
    /** Fin tirada **/
    // guardamos las veces que pasa por aquí para ver las
    archivo << "*******************************" << endl;
    /***********************/
    archivo.close();
    /** CERRANDO ARCHIVO **/

    /*** Pregunta de jugar de nuevo ***/
    char elecc;
    cout << endl
         << "\tQuieres jugar de nuevo? s/n  ";
    cin >> elecc;
    if (elecc == 's')
    {
        juego();
    }
}
