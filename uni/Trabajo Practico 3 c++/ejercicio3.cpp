#include <iostream>
using namespace std;

int main (){
    char letra;
    
    cout << "Ingrese una letra para determinar si es vocal o no: ";
    cin >> letra;
    char mayuscula=toupper(letra);
    if (mayuscula=='A' or mayuscula=='E' or mayuscula=='I' or mayuscula=='O' or mayuscula=='U')
    {
        cout << "Su letra " << letra << " es una vocal.";
    } else {
        cout << "Su letra " << letra << " no es una vocal.";
    }
    return 0;
}