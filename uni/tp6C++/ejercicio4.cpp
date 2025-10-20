#include <iostream>
using namespace std;

//CON BURBUJEO COMPARA SI ARREGLO[I] > ARREGLO[I+1] ENTONCES CAMBIA LAS POSCIONES 
void burbujeo (){
    int n = 6;
    int arreglo[n] = {6,4,9,12,5,1};
    cout << "El arreglo ordenado ascendentemente quedaria: " << endl;
    int temp;
    for (int i = 0; i < n-1; i++){
        for (int j = 0; j < n-1; j++){
            if (arreglo[j] > arreglo [j+1])
            {
                temp = arreglo[j];
                arreglo[j] = arreglo [j+1];
                arreglo[j+1] = temp;
            }
        } 
    }

    for (int i = 0; i < n; i++){
        cout << arreglo[i] << "\t";
    }
    
}

void seleccionDirecta(){
//SELECCION DIRECTA: POR CADA ITERACION BUSCA EL MENOR E INTERCAMBIA LOS VALORES CON EL QUE ESTA EN LA POSCCION 0
    int n = 6;
    int arreglo[n] = {6,4,9,12,5,1};
    cout << "El arreglo ordenado ascendentemente quedaria: " << endl;
    int temp;

    for (int i = 0; i < n-1; i++)
    {
        int menor = i;
        for (int j = i+1; j < n; j++)
        {
            if (arreglo[j] < arreglo[menor])
            {
                menor = j;
            }
        }

        if (menor > i){
            int temp;
            temp = arreglo[i];
            arreglo[i] = arreglo[menor];
            arreglo[menor] = temp; 
        }
        
    } 
    for (int i = 0; i < n; i++)
    {
        cout << arreglo[i] << "\t";
    }
    
    
}

void inserccion(){
    int n = 6, pos, temp;
    int arreglo[n] = {8,7,5,11,54,3};
    
    for (int i = 0; i < n; i++)
    {
        pos = i;
        temp = arreglo[i];
        
        while ((pos > 0) && (arreglo[i-1] > temp))
        {
            arreglo[pos] = arreglo[pos-1];
            pos--;
        }
        arreglo[pos] = temp;
    }
    
    for (int i = 0; i < n; i++)
    {
        cout << arreglo[i] << "\t";
    }
    cout << endl << endl;
}

void inserccionIntercambios(){
    int n = 6;
    int arreglo[n] = {68,34,54,76,90,3};
    cout << "El arreglo ordenado ascendentemente quedaria: " << endl;

    for (int i = 1; i < n; i++) {
        int j = i;
        while (j > 0 && arreglo[j - 1] > arreglo[j]) {
            int temp = arreglo[j];
            arreglo[j] = arreglo[j - 1];
            arreglo[j - 1] = temp;
            j--;
        }
    }

    for (int i = 0; i < n; i++)
    {
        cout << arreglo[i] << "\t";
    }
    
}

int main(){
    int opcion;
    do
    {    
        cout << "1. ordenamiento por burbujas." << endl;
        cout << "2. ordenamiento seleccion directa." << endl;
        cout << "3. ordenamiento insercion." << endl;
        cout << "4. ordenamiento insercion Intercambio." << endl;
        cout << "ingrese un ordenamiento: ";
        cin >> opcion;

        switch (opcion)
        {
        case 1:
            burbujeo();
            cout << endl;
            break;
        case 2: 
            seleccionDirecta();
            cout << endl;
            break;
        case 3:
            inserccion();
            cout <<endl;
            break;
        case 4:
            inserccionIntercambios();
            cout <<endl;
            break;

        default:
            break;
        }

    } while (opcion != 5);
    
}

