#include <iostream>
#include <windows.h>
using namespace std;
/****************************/
/******** STRUCTS ***********/
/****************************/
struct serVivo
{
    int idAnimal;
    string raza;
    string nombre;
    bool bien, porRevisar, enTratamiento;
};
/****************************/
/*********** CONST **********/
/****************************/
const int MAX = 10;
/****************************/
/**** FUNCIONES A LLAMAR ****/
/****************************/
void estadisticaEstado(serVivo animal[]);
void estadisticaTotal(serVivo animal[]);
void rellenarDatos(serVivo animal[]);
void mostrarLista(serVivo animal[]);
void buscarID(serVivo animal[]);
void cambiarEstado(serVivo animal[]);
void listaTodos(serVivo animal[]);
void eliminarAnimales(serVivo animal[]);
void agregarAnimales(serVivo animal[]);
void menu(serVivo animal[]);
/******************************************/
/************* MAIN ***********************/
/******************************************/
int main()
{
    SetConsoleOutputCP(CP_UTF8); // Consola en español
    serVivo animal[MAX];
    rellenarDatos(animal);
    // Metemos el menu que lo usaremos para movernos por los programas
    menu(animal);

    return 0;
}
/****************************************************************/
/************************** FUNCIONES ***************************/
/****************************************************************/
/*          Funcion: Mostrar lista                              */
/****************************************************************/
/* Mostramos la lista siempre que la usemos                     */
/* Entrada: array de serVivo | Salida: ninguna                  */
/****************************************************************/
void mostrarLista(serVivo animal[])
{

    for (int i = 0; i < MAX; i++)
    {
        if (animal[i].raza == " ")
        {
            cout << "\tNo existe un animal con el código " << animal[i].idAnimal;
        }
        else
        {
            cout << "\tAnimal número " << i + 1 << " ....... "
                 << "ID: " << animal[i].idAnimal << " | Raza: "
                 << animal[i].raza << " | De nombre: " << animal[i].nombre << " | Estado: ";

            if (animal[i].bien == true)
            {
                cout << "bien.\n";
            }
            else if (animal[i].porRevisar == true)
            {
                cout << "por revisar.\n";
            }
            else
            {
                cout << "en tratamiento.\n";
            }
        }
    }
}

/**************************************************************/
/*          Funcion: Estadística de con un estado concreto    */
/**************************************************************/
/* Número total de animales en estado que elija el usuari     */
/*  y el porcentaje que se representa en total                */
/* Entrada: array de serVivo | Salida: ninguna                */
/**************************************************************/
void estadisticaEstado(serVivo animal[])
{
    int contador = 0, contadorBien = 0, contadorRevisar = 0, contadorTratamiento = 0, elecc;
    string texto;

    cout << "\t Elige el estado del que quieres ver las estadísticas: \n"
         << "\t1 ............................................... Bien\n"
         << "\t2 ........................................ Por revisar\n"
         << "\t3 ..................................... En tratamiento\n\t";
    cin >> elecc;

    // TOTAL DE ANIMALES QUE TENEMOS
    for (int i = 0; i < MAX; i++)
    {
        if (animal[i].raza == " ")
        {
            contador++;
        }
        else
        {
            if (animal[i].bien == true && elecc == 1)
            {
                contadorBien++;
            }
            else if (animal[i].porRevisar == true && elecc == 2)
            {
                contadorBien++;
                contadorRevisar++;
            }
            else if (animal[i].enTratamiento == true && elecc == 3)
            {
                contadorBien++;
                contadorTratamiento++;
            }
        }
    }

    // Comprobamos si hay datos en las listas
    if (contador >= MAX)
    {
        cout << "\tNo hay datos en la lista.\n";
    }
    else
    {
        int totalAnimales, totalEstado, total;

        switch (elecc)
        {
        case 1:
            texto = "bien";
            break;
        case 2:
            texto = "por revisar";
            break;
        case 3:
            texto = "en tratamiento";
            break;
        default:
            // Manejo adecuado si la opción no es válida
            cout << "\tOpción no válida.\n";
            return;
        }

        totalAnimales = contadorBien;
        totalEstado = contadorBien + contadorRevisar + contadorTratamiento;

        // Asegurarse de no dividir por cero
        if (totalEstado > 0)
        {
            total = (100 * totalAnimales) / totalEstado;
            cout << "\tEl porcentaje de los animales que están " << texto << " es: " << total << "%"
                 << "\tEn total hay " << contadorBien << " animales que están " << texto << ".\n";
        }
        else
        {
            cout << "\tNo hay animales en el estado seleccionado.\n";
        }
    }
}


/****************************************************************/
/*          Funcion: Estadística total de animales              */
/****************************************************************/
/* Miramos que cantidad de animales tenemos y la mostramos      */
/* Entrada: array de serVivo | Salida: ninguna                  */
/****************************************************************/
void estadisticaTotal(serVivo animal[])
{
    int contador = 0;
    for (int i = 0; i < MAX; i++)
    {
        if (animal[i].raza == " ")
        {
            contador++;
        }
    }

    int total = 10 - contador;

    if (total <= 0)
    {
        cout << "\tNo hay datos en la lista.\n";
    }
    else
    {
        cout << "\tHay un total de " << total << " animales.\n";
    }
}

/****************************************************************/
/*          Funcion: Rellenar datos                             */
/****************************************************************/
/* Añadimos el texto base para poder sobreescribirlo            */
/* Entrada: array de serVivo | Salida: ninguna                  */
/****************************************************************/
void rellenarDatos(serVivo animal[])
{
    // Usamos esto para llenar el array con 0 y de esta forma poder controlar lo que introducimos
    // LE METEMOS AUTO PARA VER
    for (int i = 0; i < MAX; i++)
    {


        animal[i].bien = false;
        animal[i].porRevisar = false;
        animal[i].enTratamiento = false;
        animal[i].idAnimal = i + 1;
        animal[i].raza = " ";
        animal[i].nombre = " ";
    }
}
/****************************************************************/
/*          Funcion: Buscar nombre                                  */
/****************************************************************/
/* Le pedimos al usuario que nos escriba el nombre                 */
/* Al buscarlo, si no existe vamos a volver a pedir los datos   */
/* Entrada: array de serVivo | Salida: ninguna                  */
/****************************************************************/
void buscarNombre(serVivo animal[])
{
    string elecc;
    int contador = 0;

    cout << "\tEscribe nombre el animal que quieres buscar: ";
    cin >> elecc;
    for (int i = 0; i < MAX; i++)
    {
        if (elecc == animal[i].nombre)
        {
            contador++;

            mostrarLista(animal);
        }
        else
        {
            cout << "\tNo has introducido correctamente los datos, vuelve a introducirlos... \n";
            buscarNombre(animal);
        }
    }

    menu(animal);
}
/****************************************************************/
/*          Funcion: Buscar ID                                  */
/****************************************************************/
/* Le pedimos al usuario que nos escriba el ID                  */
/* Al buscarlo, si no existe vamos a volver a pedir los datos   */
/* Entrada: array de serVivo | Salida: ninguna                  */
/****************************************************************/
void buscarID(serVivo animal[])
{
    int elecc, contador = 0;

    cout << "\t Recuerda que el ID está escrito en números enteros...\n"
         << "\tEscribe ID el animal que quieres buscar";
    cin >> elecc;
    for (int i = 0; i < MAX; i++)
    {
        if (elecc == animal[i].idAnimal)
        {
            contador++;

            mostrarLista(animal);
        }
        else
        {
            cout << "\tNo has introducido correctamente los datos, vuelve a introducirlos... \n";
            buscarID(animal);
        }
    }

    menu(animal);
}
/**********************************************************************/
/*          Funcion: Cambiar estados                                  */
/**********************************************************************/
/* Vamos a mostrar por pantalla la lista que tenemos y                */
/* luego le pediremos al usuario que por ID nos cambie el estado      */
/* Entrada: array de serVivo | Salida: ninguna                        */
/**********************************************************************/
void cambiarEstado(serVivo animal[])
{
    int elecc;
    string estado;
    mostrarLista(animal);

    cout << "\tElige por el ID el animal al que quieres cambiarle el estado: ";
    cin >> elecc;
    cin.ignore();

    cout << "\tElige el estado al que quieres cambiarle\n"
         << "\tPuedes cambiarlo a: bien, por revisar, en tratamiento:  ";
    getline(cin, estado);

    if (estado == "bien")
    {
        animal[elecc].bien = true;
        animal[elecc].porRevisar = false;
        animal[elecc].enTratamiento = false;
    }
    else if (estado == "por revisar")
    {
        animal[elecc].bien = false;
        animal[elecc].porRevisar = true;
        animal[elecc].enTratamiento = false;
    }
    else if (estado == "en tratamiento")
    {
        animal[elecc].bien = false;
        animal[elecc].porRevisar = false;
        animal[elecc].enTratamiento = true;
    }

    menu(animal);
}
/************************************************************************/
/*          Funcion: Eliminar animales                                  */
/************************************************************************/
/* Necesitamos saber que animales tenemos en la base de datos           */
/* Después de confirmarlo se tomará lo que necesitemos y lo borraremos  */
/* Entrada: array de serVivo | Salida: ninguna                          */
/************************************************************************/
void eliminarAnimales(serVivo animal[])
{
    int elecc;
    mostrarLista(animal);

    cout << "\tElige por el ID el animal que quieres borrar.\n"
            "\tSolo puedes hacerlos con los que tengan el estado de 'bien'  ";
    cin >> elecc;

    if (animal[elecc].bien == true)
    {
        animal[elecc].bien = false;
        animal[elecc].porRevisar = false;
        animal[elecc].enTratamiento = false;
        animal[elecc].idAnimal = elecc;
        animal[elecc].raza = " ";
        animal[elecc].nombre = " ";
        cout << "\tSe ha cambiado correctamente su estado.\n";
    }
    else
    {
        cout << "\tNo se que has hecho, pero seguro que puedes hacerlo mejor.\n";
        eliminarAnimales(animal);
    }

    menu(animal);
}

/******************************************************/
/*          Funcion: Agregar nuevos animales          */
/******************************************************/
/* Se le agregará un id único y su estado por defecto */
/* será "Por revisar"                                 */
/* Entrada: array de serVivo | Salida: ninguna        */
/******************************************************/

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
                    cin.ignore();
                    cout << "\tDi el nombre del animal: ";
                    getline(cin, animal[i].nombre);
                } while (animal[i].nombre == " ");
                do
                {
                    cout << "\tDi la raza del animal: ";
                    getline(cin, animal[i].raza);
                } while ((animal[i].raza == " ") || (animal[i].raza.length() > 10)); // Esto va bien

                animal[i].enTratamiento = true;
            }

            cout << "\n\t¿Quieres añadir un nuevo animal?\n\ts / n  ";
            cin >> elecc;
            if (!(elecc == 's' || elecc == 'S'))
            {
                i = MAX;
            }
        }
    }

    menu(animal);
}
/*********************************************************************/
/*          Funcion: Lista animales                                  */
/*********************************************************************/
/* Se muestran los datos que hemos metidos anteriormente             */
/* Si los datos no se han introducido ha de decirse que no existe    */
/*       Entrada: array de serVivo | Salida: ninguna                 */
/*********************************************************************/
void listaTodos(serVivo animal[])
{
    int contador = 0;

    for (int i = 0; i < MAX; i++)
    {
        if (animal[i].raza == " ")
        {
            contador++;
        }
        else
        {
            cout << "\tAnimal número " << i + 1 << " ....... "
                 << "ID: " << animal[i].idAnimal << " | Raza: "
                 << animal[i].raza << " | Nombre: " << animal[i].nombre << " | Estado: ";

            if (animal[i].bien == true)
            {
                cout << "bien.\n";
            }
            else if (animal[i].porRevisar == true)
            {
                cout << "por revisar.\n";
            }
            else
            {
                cout << "en tratamiento.\n";
            }
        }
    }
    if (contador == 10)
    {
        cout << "\n\tNo hay datos, tienes que añadirlos para poder verlos.";
    }
    cout << endl;
}
/*************************************************************************/
/*          Funcion: Menu                                                */
/*************************************************************************/
/* Se añade una opción de menu para poder que elección tomará el usuario */
/*       Entrada: array de serVivo | Salida: ninguna                     */
/*************************************************************************/

void menu(serVivo animal[])
{
    int elecc;

    cout << "\n\t.........................................\n"
         << "\tMENÚ VETERINARIO ........................\n"
         << "\t1 ............... Agregar nuevos animales\n"
         << "\t2 ..................... Eliminar animales\n"
         << "\t3 ........ Cambiar el estado de un animal\n"
         << "\t4 .... Ver la lista de todos los animales\n"
         << "\t5 ......................... Buscar por...\n"
         << "\t6 ...................... Ver estadísticas\n"
         << "\t7 ................................ Salida \n\t";
    cin >> elecc;
    cout << endl;
    switch (elecc)
    {
    case 1:
        cout << "\tElegiste agregar nuevos animales.\n";
        agregarAnimales(animal);
        break;
    case 2:
        cout << "\tElegiste eliminar animales.\n";
        eliminarAnimales(animal);
        break;
    case 3:
        cout << "\tElegiste cambiar el estado de un animal.\n";
        cambiarEstado(animal);

        break;
    case 4:
        cout << "\tElegiste ver la lista de todos los animales.\n";
        listaTodos(animal);
        break;
    case 5:
        cout << "\tElegiste buscar por ..........\n"
             << "\t1 ........................... ID\n"
             << "\t2 ....................... Nombre\n\t";
        cin >> elecc;
        cout << endl;

        switch (elecc)
        {
        case 1:
            cout << "\tElegiste buscar por ID.\n";
            buscarID(animal);
            break;
        case 2:
            cout << "\tElegiste buscar por Nombre.\n";
            buscarNombre(animal);
            break;

        default:
            menu(animal);
            break;
        }

        break;
    case 6:
        cout << "\tElegiste ver estádisticas por .......\n"
             << "\t1 ..... Total de animales en la lista\n"
             << "\t2 ..... Total de animales por su estado\t";
        cin >> elecc;
        cout << endl;
        switch (elecc)
        {
        case 1:
            cout << "\tElegiste ver estadísticas por el total de animales en la lista.\n";
            estadisticaTotal(animal);
            break;
        case 2:
            cout << "\tElegiste ver estadísticas por su estado.\n";
            estadisticaEstado(animal);
            break;

        default:
            menu(animal);
            break;
        }

        break;
    case 7:
        cout << "\tEstas saliendo del programa... ";
        break;

    default:
        menu(animal);
        break;
    }
}

/*
• ID (Número entero)
• Raza (Cadena de texto, máximo 10 caracteres)
• Nombre (Cadena de texto)
• Estado (Sus valores posibles serán: "Bien", "Por Revisar", "En tratamiento").
El ID será asignado automá�camente por el programa y no podrá ser modificado por el usuario
al introducir los datos del animal, asegurando que sea único. Dos animales no podrán tener el
mismo ID.
El tamaño máximo de animales que podemos manejar es de 10 (Se sugiere u�lizar una
constante para almacenar este valor).
Nuestro programa debe ser capaz de realizar las siguientes acciones:
1. Agregar nuevos animales: Al crear un animal se le asignará un ID único, y su estado por
defecto será "Por revisar".
2. Eliminar animales: Solo se permi�rá si el estado es "Bien"; en caso contrario, no se
permi�rá su eliminación.
3. Cambiar el estado de UN animal.
4. Ver la lista de todos los animales.
5. Buscar por:
• ID
• Nombre
6. Ver estadís�cas: Deberá mostrar datos estadís�cos sobre los animales guardados en la
lista. Esta opción mostrará los siguientes datos:
• Número total de animales en la lista.
• Número total de animales en estado "Bien" y el porcentaje que representa con
respecto al total.
• Número total de animales en estado "Por revisar" y el porcentaje que
representa con respecto al total.
• Número total de animales en estado "En tratamiento" y el porcentaje que
representa con respecto al total.
*/