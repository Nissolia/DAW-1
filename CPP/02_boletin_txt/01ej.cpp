#include <iostream>
#include <fstream>
using namespace std;
// Crea un programa que muestre las tres primeras
// palabras que contenga un fichero de texto.
int main()
{
    string texto;

    ifstream archivo;

    archivo.open("01ej.txt");

    cout << endl;
    if (archivo.is_open())
    {
        getline(archivo, texto);
        cout << texto << endl;
    }
    else
    {

        cout << "El archivo no existe." << endl;
    }

    archivo.close();

    cout << "\tPrograma finalizado." << endl;
    return 0;
}
