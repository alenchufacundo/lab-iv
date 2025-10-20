#include <iostream>
using namespace std;

double valorMax(int arreglo[], int n){
    double max = arreglo[0];
    for (int i = 0; i < n; i++)
    {
        if (arreglo[i]>max)
        {
            max = arreglo[i];
        }
        
    }
    return max;
}
void burbujeo(){
    int temp = 0;
    int arreglo[3] = {8,6,5};
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (arreglo[j] < arreglo[j+1])
            {
                temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;
            }
            
        }
        
    }
    for (int i = 0; i < 3; i++)
    {
        cout << arreglo[i] << "\t";
    }
    
}

int main(){
    int n = 9;
    int arreglo[n] = {11,85,4,99,2365,8,156,-1,0}; 
    cout << "El valor maximo del arreglo es: " << valorMax(arreglo,n);
    cout << endl << endl;
    burbujeo();
}