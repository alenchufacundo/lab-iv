#include <iostream>
using namespace std;

int sumaArreglo(int arreglito[], int n){
    int suma=0;
    for (int i = 0; i < n; i++)
    {
        suma = suma+arreglito[i];
    }
    return suma;
}

int main(){
    int n = 3;
    int arreglo[n] = {11,85,4};
    
    cout << "La suma del arreglo es igual a : " << sumaArreglo(arreglo,n);
}