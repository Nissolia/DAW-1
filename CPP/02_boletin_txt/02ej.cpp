#include <iostream>
#include <fstream>
using namespace std;
/************************************************************************************/
/* Crea un programa que muestre las tres primeras líneas que contenga un fichero de */
/*                   texto, cuyo nombre deberá introducir el usuario                */
int main()
{
    string texto, fichero;
    // lectura de texto
    ifstream archivo;

    cout << endl
         << "Dime el fichero que quieres leer, recuerda poner '.txt' al final: " << endl
         << "Actualmente existe el archivo: 01ej.txt." << endl;
    cin >> fichero;

    archivo.open(fichero);

    cout << endl;
    if (archivo.is_open())
    {
        getline(archivo, texto);
        cout << texto << endl;

        for (int i = 0; i < 2; i++)
        {
            getline(archivo, texto);

            cout << texto << endl;
        }
    }
    else
    {

        cout << "El archivo no existe." << endl;
    }

    archivo.close();

    cout << "\t Programa finalizado." << endl;
    return 0;
}
