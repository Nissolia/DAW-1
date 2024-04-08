#include <iostream>
using namespace std;
/****************************** EJERCICIO *****************************/
/* Escribir un programa que muestre una salida con la siguiente       */
/* secuencia numérica:1, 5, 3, 7, 5, 9, 7, ..., 23. La secuencia debe */
/* detenerse al llegar a un número que sea superior a N. N será un    */
/* numero aleatorio entre El enunciado es rebuscado, pero ilustra el  */
/* 20 y 60. La secuencia se obtiene partiendo de 1 y sumando y        */
/* restando 4 y 2, alternativamente.                                  */

/********************* FUNCIONES *********************/
void secuencia(int num);
/***********************  MAIN **********************/
int main()
{
    // Variables
    int numeroUser;

    // Introducimos numeros y vemos si esta correctamente introducido
    do
    {
        cout << "Introduce un numero entre 20 y 60...\n\tVoy a mostrarte una secuencia: ";
        cin >> numeroUser;
    } while (numeroUser > 60 || numeroUser < 20);

    secuencia(numeroUser);

    return 0;
}
/**************************** FUNCIONES ****************************/
/* Sumamos 4 a los impares y restamos 2 a los pares                */
/* de esta forma logramos que el segundo numero no nos de negativo */
/*            Entrada: numero que introduce el usuario             */
/*            Salida: ninguna                                      */
/*******************************************************************/
void secuencia(int num)
{
    // Num es el introducido por el usuario
    int aux = 1;
    // Partimos de 1, sumando 4 y restando 2
    cout << aux << "  ";
    for (int i = 1; i < num; i++)
    {
        if (i % 2 == 0) // contador par
        {
            aux += -2;
            cout << aux << "  ";
        }
        else // contando impar
        {
            aux += 4;
            if (aux > num)
            {
                cout << endl
                     << "\tPrograma finalizado.";
                     i = num;
            }
            else
            {
                cout << aux << "  ";
            }
        }
    }
}