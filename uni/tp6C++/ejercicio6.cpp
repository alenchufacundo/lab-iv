#include <iostream>
using namespace std;

int cargarMatriz(int suma);

int main(){
    int suma= 0;
    cout << cargarMatriz(suma);
}

int cargarMatriz(int suma=0){
    int n=3, numero;
    int matriz[n][n];

    for (int i = 0; i < n; i++)
    {
        for (int  j = 0; j < n; j++)
        {
            cout << "Ingrese en la pos " << i << j << " : ";
            cin >> numero;
            matriz[i][j] = numero;
            suma = suma + numero;
        }        
    }
    return suma;
}
