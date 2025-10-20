#include <iostream>
#include <string>
using namespace std;

string quitarVocales(string cadena);

int main(){
    string cadena;
    cout << "Ingrese la cadena(sin ñ xfavor): ";
    getline(cin, cadena);
    cout << quitarVocales(cadena);
    return 0;
}

string quitarVocales(string cadena){
    string resultado = "";
    for (int i = 0; i < cadena.length(); i++)
    {
        char c = tolower(cadena[i]);
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
            resultado += cadena[i];
        }
        
    }
    
    return resultado;
}
