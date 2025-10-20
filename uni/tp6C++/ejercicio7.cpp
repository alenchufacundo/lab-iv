#include <iostream>
using namespace std;

double promedioArreglo(double promedio);

int main(){
    double promedio= 0;
    cout << promedioArreglo(promedio);

}

double promedioArreglo(double promedio){
    int numero, suma= 0;
    int arreglo[5];
    for (int i = 0; i < 5; i++)
    {
        cout << "Ingrese en la pos " << i << " : ";
        cin >> numero;
        arreglo[i] = numero;
        suma += numero; 
    }
    promedio = suma/5.0;
    return promedio;
}