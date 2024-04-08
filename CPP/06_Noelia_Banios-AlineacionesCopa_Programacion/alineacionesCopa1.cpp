#include <iostream>
#include <windows.h>
#include <ctime>
/*****************************/
/*  HECHO POR @NOELIA BAÑOS  */
/*****************************/
using namespace std;
/******************************/
/*         CONSTANTES         */
/******************************/
const int POSICIONES = 5;
/******************************/
/*  DECLARACION DE FUNCIONES  */
/******************************/
void meterDatos(int array1[], int array2[], int POSICIONES);
/*********************/
/*        MAIN       */
/*********************/
int main()
{
    SetConsoleOutputCP(CP_UTF8); // Consola en español
    srand(time(NULL));
    // VARIABLES
    int array1[POSICIONES];
    int array2[POSICIONES];
    // RELLENADO DE DATOS DEL PRIMER ARRAY
    for (int i = 0; i < POSICIONES; i++)
    {
        array1[i] = rand() % 20;
    }
    meterDatos(array1, array2, POSICIONES);

    // SIGUIENTE
    cout << "\n------------------------" << endl;
    int elecc, num;

    // BUCLE EN EL QUE PREGUNTAMOS LA POSICIÓN DEL NUMERO QUE SE VA A CAMBIAR
    do
    {
        cout << "¿En qué posición quieres introducir el número?" << endl;
        cin >> elecc;
        cout << "¿Qué número quieres introducir?" << endl;
        cin >> num;

        array1[elecc - 1] = num;
        meterDatos(array1, array2, POSICIONES);

    } while (num == 0);

    return 0;
}
/*************************************************************************/
/*                          FUNCION METER DATOS                          */
/*************************************************************************/
/* Añadimos los datos que necesitamos para que entre los array           */
/* se cambien las posiciones que necesitamos                             */
/*        Entrada: ambos arrays y las posiciones que se usan en el array */
/*        Salida: nunguna                                                */
/*************************************************************************/
void meterDatos(int array1[], int array2[], int POSICIONES)
{
    // PASO DE DATOS AL OTRO ARRAY
    for (int i = 0; i < POSICIONES; i++)
    {
        array2[i] = array1[4 - i];
    }

    // MOSTRAR POR PANTALLA EL PRIMERO
    cout << "Primer array" << endl;
    for (int i = 0; i < POSICIONES; i++)
    {
        cout << array1[i] << " | ";
    }

    // MOSTRAR POR PANTALLA EL SEGUNDO
    cout << "\nSegundo array" << endl;
    for (int i = 0; i < POSICIONES; i++)
    {
        cout << array2[i] << " | ";
    }
    cout << endl;
}
