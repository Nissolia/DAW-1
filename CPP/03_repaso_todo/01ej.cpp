#include <iostream>
#include <fstream>
#include <windows.h>
using namespace std;
/********************** EJERCICIO  **********************/
/*   Max 50 alumnos.                Dato >> nombre nota */
/* listadoAlumnosProg.txt << donde se guardan las cosas */
/********************************************************/

/********************* ESTRUCTURAS **********************/
struct alumno
{
    string nombre;
    int nota;
};
/********************* CONSTANTES ************************/
const short MAXALUMNOS = 50;
const short MAXNOTA = 10;
const short MINNOTA = 0;
/********************** FUNCIONES ***********************/
int rellenarLista(alumno lista[]);
/***************** PROGRAMA PRINCIPAL *******************/
int main()
{
    SetConsoleOutputCP(CP_UTF8); // Consola en español

    // Variables
    alumno listaAlumnos[MAXALUMNOS];
    // Rellenar el array de los datos
    int contador = rellenarLista(listaAlumnos);

    // Guardamos en fichero txt
    ofstream archivo;
    archivo.open("listadoAlumnosProg.txt", ios::app);
    // abrir archivo para leer

    int aux = 0;
    while (contador > aux)
    {
        archivo << listaAlumnos[aux].nombre << " " << listaAlumnos[aux].nota << endl;

        aux++;
    }

    archivo.close();
    return 0;
}
/*********************************************************/
/*                       FUNCIONES                       */
/*********************************************************/

/*      Funcion rellenarLista                            */
/* Rellena los datos de los alumnos                      */
/* Entrada: array de alumnos con campos:                 */
/*          nombre (string) y nota (int)                 */
/* Salida: numero alumno                                 */
int rellenarLista(alumno lista[])
{
    int contador = 0;
    char elecc;
    cout << "¿Qué introducir un alumno? s/n ";
    cin >> elecc;

    do
    {
        cin.ignore();
        cout << "Dime el nombre: ";
        getline(cin, lista[contador].nombre);

        cout << "Dime la nota: ";
        cin >> lista[contador].nota;

        contador++;
        cout << "¿Quieres seguir introduciendo alumnos? s/n ";
        cin >> elecc;
    } while (elecc == 's' && contador < MAXALUMNOS);

    return contador;
}