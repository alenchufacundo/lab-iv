#include <iostream>
#include <stdlib.h>
using namespace std;

double controlarTemperatura();
int controlarIluminacion();
bool controlarRiego();

int main (){
    int opcion;
    cout << "1. controlar temperatura" << endl;
    cout << "2. controlar iluminacion" << endl;
    cout << "3. controlar riego" << endl;
    cout << "4. salir" << endl;
    cout << "ingrese un numero: ";
    cin >> opcion;
    double salida = 0;
    string muestra = "";
    switch (opcion)
    {
    case 1:
        salida = controlarTemperatura();
        cout << "La temperatura se regulo en: " << salida << " grados centigrados.";
        break;

    case 2:
        salida = controlarIluminacion();
        cout << "La iluminacion se regulo en: " << salida << " grados de intensidad.";
        break;
    
    case 3:
       
        salida = controlarRiego();
        if (salida == 1)
        {
            muestra = "Encendido.";
        } else{
            muestra = "Apagado.";
        }
        cout << "El sistema de riego se encuentra: " << muestra;
        break;

    default:
        break;
    }
    
}

double controlarTemperatura(){
    double temp;
    cout << "Ingresar temperatura entre 17.9 y 24.5: ";
    cin >> temp;
    while(temp <17.9 or temp>24.5){
        cout << "Temperatura erronea. Vuelva a ingresarla: ";
        cin >> temp;
    }
    return temp;
}

int controlarIluminacion(){
    int intensidad;
    cout << "Ingresar intensidad de la iluminacion entre 0 y 100: ";
    cin >> intensidad;
    while (intensidad >100 or intensidad < 0){
        cout << "Intensidad erronea. Vuelva a ingresarla: ";
        cin >> intensidad;
    }
    return intensidad;
}

bool controlarRiego(){
    bool estado = false;
    cout << "Ingresar 1 para prender, 0 para apagar: ";
    int n;
    cin >> n;
    while (n !=1 and n!=0){
        cout << "Estado incorrecto. Vuelva a ingresar: ";
        cin >> n;
    }

    if (n==1)
    {
        estado = true;
    }

    return estado;
}