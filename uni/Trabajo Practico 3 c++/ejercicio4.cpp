#include <iostream>
using namespace std;

int main (){
    int cantidadZapatos;
    double precio;
    cout << "Ingrese cantidad de zapatos comprados: ";
    cin >> cantidadZapatos;

    if (cantidadZapatos >=30){
            cantidadZapatos = cantidadZapatos*8000;
            precio = cantidadZapatos * 0.40;
            precio = cantidadZapatos - precio;
            cout << "El precio con el 40% de descuento es de: " << precio; 
    } else {
        if (cantidadZapatos >=10 and cantidadZapatos<20)
        {
            cantidadZapatos = cantidadZapatos*8000;
            precio = cantidadZapatos * 0.10;
            precio = cantidadZapatos - precio;
            cout << "El precio con el 10% de descuento es de: " << precio; 

        } else {
            if (cantidadZapatos>=20 and cantidadZapatos<30)
            {
                cantidadZapatos = cantidadZapatos*8000;
                precio = cantidadZapatos * 0.20;
                precio = cantidadZapatos - precio;
                cout << "El precio con el 20% de descuento es de: " << precio; 
            } 
                else{
                    precio=cantidadZapatos*8000;
                    cout << "El precio sin descuento es de: " << precio;
                }
            
        }
        
    }
}