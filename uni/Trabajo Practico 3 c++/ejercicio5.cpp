#include <iostream>
using namespace std;

int main (){
    int horasTrabajadas,sueldo;
    cout << "ingrese la cantidad de horas trabajadas: ";
    cin >> horasTrabajadas;

    if (horasTrabajadas<40){
        sueldo=horasTrabajadas*1000;
        cout << "El Sueldo con menos de 40 horas trabajadas es de: " << sueldo;
    } else{
        sueldo=horasTrabajadas*2000;
        cout << "El Sueldo con mas de 40 horas trabajadas es de: " << sueldo;
    }
}