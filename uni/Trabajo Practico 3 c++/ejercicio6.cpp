#include <iostream>
using namespace std;

int main (){
    char membresia;
    double montoCompra,compraTotal;

    cout << "Ingrese el monto de la compra: ";
    cin >> montoCompra;

    cout << "Ingrese Su tipo de membresia: ";
    cin >> membresia;
    char mayus = toupper(membresia);

    switch (mayus)
    {
    case'A':
        compraTotal = montoCompra*0.10;
        compraTotal = montoCompra-compraTotal;
        cout << "Su compra con el tipo de membresia A (10% de descuento) es de: " << compraTotal;
        break;
    
    case'B':
        compraTotal = montoCompra*0.15;
        compraTotal = montoCompra-compraTotal;
        cout << "Su compra con el tipo de membresia B (15% de descuento) es de: " << compraTotal;
        break;
        
    case'C':
        compraTotal = montoCompra*0.20;
        compraTotal = montoCompra-compraTotal;
        cout << "Su compra con el tipo de membresia C (20% de descuento) es de: " << compraTotal;
        break;

    default:
        cout << "Usted no tiene membresia el total es: " << montoCompra;
        break;
    }
    return 0;
}