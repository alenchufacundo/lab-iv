#include <iostream>
#include <stdlib.h>
using namespace std;

struct persona
{
    int edad;
    string nombre;
    char direccion[50];
}p1;

void llamarDatosStruct(persona d);

int main(){    
    cout << "Ingrese su nombre: ";
    cin >> p1.nombre;
    cout << endl << "Ingrese su edad: ";
    cin >> p1.edad;
    cout << endl <<"Ingrese su direccion: ";
    cin.ignore();  
    cin.getline(p1.direccion, 50);
    
    llamarDatosStruct(p1);
}

void llamarDatosStruct(persona p1) {
    cout << "Nombre: " << p1.nombre << endl;
    cout << "Edad: " << p1.edad << endl;
    cout << "Direccion: " << p1.direccion << endl;
}