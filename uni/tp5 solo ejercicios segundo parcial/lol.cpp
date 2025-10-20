#include <iostream>
using namespace std;

int main() {
    int arreglo[] = {5, 2, 8, 1, 9, 3, 7, 4, 6, 0};
    int temp;

    // Sorting the array using bubble sort
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9 - i; j++) {
            if (arreglo[j] > arreglo[j+1]) {
                temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;
            }
        }
    }

    // Printing the sorted array
    for (int i = 0; i < 10; i++) {
        cout << arreglo[i] << "\t";
    }

    int sup = 9, inf = 0, medio, numero;
    bool opcion = false;
    cout << "\nIngrese un numero: ";
    cin >> numero;

    // Performing binary search
    while (inf <= sup) {
        medio = (inf + sup) / 2;
        if (arreglo[medio] == numero) {
            opcion = true;
            break;
        }
        if (arreglo[medio] > numero) {
            sup = medio - 1;
        }
        if (arreglo[medio] < numero) {
            inf = medio + 1;
        }
    }
    if (opcion) {
        cout << "El numero se encuentra en la posicion " << medio << endl;
    } else {
        cout << "El numero no se encuentra en el arreglo" << endl;
    }

    return 0;
}
