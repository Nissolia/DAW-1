// -*- coding: utf-8 -*-
#include <iostream>
#include <vector>
#include <iomanip> // Para establecer el formato de salida

using namespace std;

int main() {
    int cantidad_notas;
    vector<int> notas;

    // Solicitar la cantidad de notas
    cout << "Pon las notas que quieres hacer media: ";
    cin >> cantidad_notas;

    // Bucle para añadir notas
    for (int i = 0; i < cantidad_notas; ++i) {
        int nota;
        cout << "Introduce la nota " << i + 1 << "/" << cantidad_notas << ": ";
        cin >> nota;
        notas.push_back(nota);
    }

    // Calcular la media
    if (!notas.empty()) {
        double suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double media = suma / notas.size();

        // Mostrar la media con dos decimales
        cout << "La media de las notas es: " << fixed << setprecision(2) << media << endl;
    } else {
        cout << "No se introdujeron notas." << endl;
    }

    return 0;
}
