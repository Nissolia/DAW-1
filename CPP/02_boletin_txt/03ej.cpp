#include <iostream>
#include <fstream>
#include <windows.h>
using namespace std;
/*************************************  EJERCICIO   *************************************/
/* Crea un programa que vaya leyendo las palabras que el usuario teclee y las guarde en */
/* un fichero de texto llamado “registroDeUsuario.txt”. Terminará cuando la palabra     */
/* introducida sea "fin" (esa frase no deberá guardarse en el fichero).                 */
/****************************************************************************************/

/********************* CONSTANTES ************************/
const short MAX = 50;
int main()
{
    SetConsoleOutputCP(CP_UTF8); // Consola en español
    string texto[MAX];
    int contador = 0;
    char elecc;
    // escritura de texto
    ofstream archivo;

    archivo.open("registroDeUsuario.txt");

    cout << "¿Quieres introducir un usuario?\ts/n: ";
    cin >> elecc;

    do
    {
        cin.ignore();
        cout << "Dime el usuario: ";
        // getline(cin, texto);

        contador++;
        cout << "¿Quieres seguir introduciendo usuarios?\ts/n: ";
        cin >> elecc;
    } while (elecc != 's' && contador == MAX);
    archivo << "fin";

    archivo.close();

    cout << "\tPrograma finalizado." << endl;
    return 0;
}
