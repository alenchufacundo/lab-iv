#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

int main (){
    int dia, mes;

    cout << "Ingrese su dia nacimiento. por ejemplo (05): ";
    cin >> dia;
    
    cout << "Ingrese su mes nacimiento. por ejemplo (12): "; 
    cin >> mes;

    switch (mes)
    {
    case (mes=='1'):
        if (dia>=21 && dia<=31){
            cout << "Su signo es Acuario";
        }
        break;
    
    case 2:
        if (dia>=20 && dia<20){
            cout << "Su signo es Piscis";
        }
        break;

    case 3:
        if (dia>=21 && dia<19){
            cout << "Su signo es Aries";
        }
        break;

    case 4 :
        if (dia>=20 && dia<20){
            cout << "Su signo es Tauro";
        }
        break;

    case 5 :
        if (dia>=21 && dia<21){
            cout << "Su signo es Geminis";
        }
        break;

    case 6 :
        if (dia>=22 && dia<22){
            cout << "Su signo es Cancer";
        }
        break;

    case 7 :
        if (dia>=23 && dia<23){
            cout << "Su signo es Leo";
        }
        break;

    case 8 :
        if (dia>=24 && dia<22){
            cout << "Su signo es Virgo";
        }
        break;

    case 9 :
        if (dia>=23 && dia<22){
            cout << "Su signo es Libra";
        }
        break;

    case 10 :
        if (dia>=23 && dia<22){
            cout << "Su signo es Escorpio";
        }
        break;

    case 11 :
        if (dia>=23 && dia<21){
            cout << "Su signo es Sagitario";
        }
        break;
        
    case 12 :
        if (dia>=22 && dia<20){
            cout << "Su signo es Capricornio";
        }
        break;            

    default:
        cout <<"La fecha es invalida.";
        break;
    } 
 
 
    //cout << "Su fecha de nacimiento es: " << dia << "/" << mes;
}