#include <iostream>
#include <cctype>
/*****************************/
/*  HECHO POR @NOELIA BAÑOS  */
/*****************************/
using namespace std;
/**************************/
/*          MAIN          */
/**************************/
int main()
{
    int contador = 0;
    string vocales = "aeiouAEIOU";
    string frase;
    string fraseModificada;
    // EMPEZAMOS PROGRAMA
    cout << "Dime la frase que quieras: ";
    getline(cin, frase);

    // SE MIRA EL TAMAÑO QUE TIENE LA LARGURA DEL TEXTO
    for (int i = 0; i < frase.length(); i++)
    {
        
        char caracter = frase[i];
        if (vocales.find(caracter) != string::npos) // No supe del todo como hacerlo y recurrí a internet
        {
            contador++;
        }
    }

    // MODIFICAR FRASE
    fraseModificada = frase;
    for (int i = 0; i < fraseModificada.length(); i++)
    {
        if (fraseModificada[i] == 'a' || fraseModificada[i] == 'A')
        {
            fraseModificada[i] = 'e';
        }
    }

    // MOSTRAR POR PANTALLA
    cout << "Frase original: " << frase << endl;
    cout << "Número de vocales: " << contador << endl;
    cout << "Frase modificada: " << fraseModificada << endl;

    return 0;
}
