#include <iostream>
#include <windows.h>
using namespace std;
/*********************************** STRUCTS ***********************************/
struct serVivo
{
    int idAnimal;
    string raza;
    string nombre;
    bool bien = false;
    bool porRevisar = false;
    bool enTratamiento = false;
};
/************************************ CONST ************************************/
const int MAX = 10;
/***************************** FUNCIONES A LLAMAR *****************************/
void agregarAnimales(serVivo animal[]);
/************************************ MAIN ************************************/
int main()
{
    SetConsoleOutputCP(CP_UTF8); // Consola en español
    serVivo animal[MAX];
    // Usamos esto para llenar el array con 0 y de esta forma poder controlar lo que introducimos
    for (int i = 0; i < MAX; i++)
    {
        animal[i].idAnimal = i;
        animal[i].raza = " ";
        animal[i].nombre = " ";
    }
    // Metemos el menu que lo usaremos para movernos por los programas
    agregarAnimales(animal);

    return 0;
}

void agregarAnimales(serVivo animal[])
{
    char elecc;

    cout << "\n\t¿Quieres añadir un nuevo animal?\n\ts / n  ";
    cin >> elecc;
    if (elecc == 's' || elecc == 'S')
    {
        for (int i = 0; i < MAX; i++)
        {

            if ((animal[i].nombre == " ") && (elecc == 's' || elecc == 'S'))
            {
                do
                {
                    cout << "\tDi el nombre del animal: ";
                    cin >> animal[i].nombre;
                } while (animal[i].nombre == " ");
                do
                {
                    cout << "\tDi la raza del animal: ";
                    cin >> animal[i].raza;
                } while ((animal[i].raza == " ") || (animal[i].raza.length() > 10)); // Esto ya va bien

                  animal[i].enTratamiento = true;
            }
          
            cout << "\n\t¿Quieres añadir un nuevo animal?\n\ts / n  ";
            cin >> elecc;
            if ( !(elecc == 's' || elecc == 'S'))
            {
                i = MAX;
            }
        }
    }

    cout << "\tSalimos... ";
}
