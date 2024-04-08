// array N todos aleatorios y mostrarlos
#include <iostream>
#include <windows.h>
#include <ctime>
using namespace std;
/**CONSTANTES**/
const int MAX = 4;
/**MAIN**/
int main()
{
    SetConsoleOutputCP(CP_UTF8); // Consola en español
    srand(time(NULL));

    int array[MAX];

    for (int i = 0; i < MAX; i++)
    {
        array[i] = 1 + rand() % 20;
    };
    // Mostrar numeros
    cout << "\tMostrar array\n";
    for (int i = 0; i < MAX; i++)
    {
        cout << "  " << array[i];
    }
    // Mostrar array ordenado de menor a mayor
    int arrayOrdenado[MAX], aux = array[0];

    // Seguimos para ordenarlos
    cout << "\n\tOrdenar array\n";

    for (int i = 0; i < MAX; i++)
    {
        if (i == 0)
        {
            arrayOrdenado[i] = array[i];
        }
        for (int x = 0; x < MAX; x++)
        {
            if (arrayOrdenado[i + x] < array[i])
            {
                aux = arrayOrdenado[i];
                arrayOrdenado[i] = array[i];
            }
        }
    }

    // Final en el que se ve todo ordenado
    for (int i = 0; i < MAX; i++)
    {
        cout << "  " << arrayOrdenado[i];
    }

    return 0;
}
