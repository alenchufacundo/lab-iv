#include <iostream>
#include <stdlib.h>
using namespace std;

void intercambiarStrings(string cadena1, string cadena2);

int main(){
    string cadena1, cadena2;
    cout << "Ingrese la cadena: ";
    cin >> cadena1;
    cout << "Ingrese la cadena: ";
    cin >> cadena2;
    intercambiarStrings(cadena1, cadena2);
}

void intercambiarStrings(string cadena1, string cadena2){
    string temp;
    temp = cadena1;
    cadena1 = cadena2;
    cadena2 = temp;
    cout << "la primer linea quedaria: " << cadena1 << endl;
    cout << "la segunda linea quedaria: " << cadena2;

}
