#include <iostream>
#include <stdlib.h>
using namespace std;

int sumarMatrices(int matriz[][3], int matriz2[][3], int);

int main(){
    const int fyc = 3;
    int m[fyc][fyc], m2[fyc][fyc];
    for (int i = 0; i < fyc; i++)
    {
        for (int j = 0; j < fyc; j++)
        {
            m[i][j] = rand()%51;
            m2[i][j] = rand()%51;
            cout << m[i][j] << "\t";
            cout << m2[i][j] << "\t";
        }
        cout << endl;
    }
    
    cout << "SUMA : " << endl ;
    cout << sumarMatrices(m, m2, fyc);
}

int sumarMatrices(int matriz[][3], int matriz2[][3], int n){
    int suma= 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            suma = suma + matriz[i][j] + matriz2[i][j];
        }
        
    }
    
    return suma;
}