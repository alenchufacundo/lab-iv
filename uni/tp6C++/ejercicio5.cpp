#include <iostream>
#include <stdlib.h>
using namespace std;

void cargarMatriz(int n, int arreglo[]);
void ordenarMatrizBurbujeo(int n, int arreglo[]);
void ordenarMatrizInsercion(int n, int arreglo[]);


int main(){
    int n=5;
    int arreglo[n];
    cargarMatriz(n, arreglo);
    ordenarMatrizInsercion(n, arreglo);
}

void cargarMatriz(int n, int arreglo[]){
    int numero;
    for (int i = 0; i < n; i++)
    {
        cout << "Ingrese un numero para la poscicion " << i << ": ";
        cin >> numero;
        arreglo[i] = numero;
    }
}

void ordenarMatrizBurbujeo(int n, int arreglo[]){
    int temp=0;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            if (arreglo[j] < arreglo[j+1]){
                temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;
            }   
        }
    }
    for (int i = 0; i < n; i++){
        cout << arreglo[i];
    }
}

void ordenarMatrizInsercion(int n, int arreglo[]){
    int pos=0,aux=0;   
    for (int i = 0; i < n; i++)
    {
        pos = i;
        aux = arreglo[i];
        while (pos>0 && arreglo[pos-1]>aux)
        {
            arreglo[pos] = arreglo[pos-1];
            pos--;
        }
        arreglo[pos] = aux;
    }
    for (int i = 0; i < n; i++){
        cout << arreglo[i] << "\t";
    }

}