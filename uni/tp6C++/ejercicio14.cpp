#include <iostream>
#include <stdlib.h>
using namespace std;

int generarNumero();
void validarEntrada(int numeroUsuario);
void comprobarAdivinanza(int numeroUsuario , int numeroRandom);

int main(){
    int numeroUsario;
    srand(time(0));

    int numeroRandom = generarNumero();

    
    do{
    cout << "Ingrese un numero: ";
    cin >> numeroUsario;
    validarEntrada(numeroUsario); 
    comprobarAdivinanza(numeroUsario, numeroRandom);
    } while (numeroUsario != numeroRandom);

    
}

int generarNumero(){
    int numeroGenerado = rand() % 1000 + 1;
    return numeroGenerado;
}

void validarEntrada(int numeroUsuario){

    if (numeroUsuario>1000 || numeroUsuario<1)
    {
        cout << "El numero no esta en el rango" << endl;
    }
}

void comprobarAdivinanza(int numeroUsuario, int numeroRandom){

        if (numeroUsuario > numeroRandom)
        {
            cout << "El numero a buscar es menor" << endl;
        } else if (numeroUsuario == numeroRandom)
            {
                cout << "Hayaste el numero!!" << endl;
            } else{
                cout << "El numero a buscar es mayor" << endl;
            }
}