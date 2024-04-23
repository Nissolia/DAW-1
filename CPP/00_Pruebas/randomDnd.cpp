#include <iostream>
#include <cstdlib>
#include <ctime>
#include <limits>
using namespace std;

int randomNumber(int min, int max) {
    return rand() % (max - min + 1) + min;
}

string razas[] = {"Humano", "Elfo", "Enano", "Mediano", "Dragonborn", "Gnomo", "Medusa", "Tiefling", "Orco"};
string clases[] = {"Barbaro", "Bardo", "Clerigo", "Druida", "Hechicero", "Mago", "Monje", "Paladin", "Picaro", "Explorador", "Guerrero"};
string trasfondos[] = {"Acolito", "Charlatan", "Criminal", "Erudito", "Heroe de guerra", "Noble", "Saber popular", "Sacerdote", "Vagabundo"};
string profesiones[] = {"Alquimista", "Cazador", "Forjador", "Granjero", "Mercenario", "Pescador", "Sastre", "Tavernero", "Médico", "Minero"};

int main() {
    srand(time(0));
    char respuesta;

    do {
        int razaIndex = randomNumber(0, sizeof(razas) / sizeof(razas[0]) - 1);
        int claseIndex = randomNumber(0, sizeof(clases) / sizeof(clases[0]) - 1);
        int trasfondoIndex = randomNumber(0, sizeof(trasfondos) / sizeof(trasfondos[0]) - 1);
        int profesionIndex = randomNumber(0, sizeof(profesiones) / sizeof(profesiones[0]) - 1);

        cout << "Raza: " << razas[razaIndex] << endl;
        cout << "Clase: " << clases[claseIndex] << endl;
        cout << "Trasfondo: " << trasfondos[trasfondoIndex] << endl;
        cout << "Profesion: " << profesiones[profesionIndex] << endl;

        cout << "\n_______________________________________\n";
        cout << "¿Quieres generar otro personaje? (s/n): ";
        cin >> respuesta;
        
        // Limpiar cualquier error en el flujo de entrada
        cin.clear();
        system("cls");

        // Descartar caracteres restantes en el buffer hasta encontrar un salto de línea
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    } while (respuesta == 's' || respuesta == 'S');

    return 0;
}
