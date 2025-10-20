#include <iostream>
using namespace std;

int main (){
char operacion;
double resultado, num1, num2;

cout << "Ingrese el primer numero: ";
cin >> num1;

cout << "Ingrese el segundo numero: ";
cin >> num2;

cout << "Ingrese operacion a realizar (* , / , - , +) : ";
cin >> operacion;

do {
    cout << "Ingrese una operacion valida: ";   
    cin >> operacion;
} while (operacion != 'x' && operacion != '+' && operacion != '-' && operacion != '/');

switch (operacion) {
    case '+':
        resultado = num1 + num2;
        cout << "La suma de " << num1 << " + " << num2 << " = " << resultado;
        break;
        
    case '*':
        resultado = num1 * num2;
        cout << "La multiplicacion de " << num1 << " X " << num2 << " = " << resultado;
        break;

    case '/':
        resultado = num1 / num2;
        cout << "La division de " << num1 << " / " << num2 << " = " << resultado;
        break;

    case '-':
        resultado = num1 - num2;
        cout << "La resta de " << num1 << " - " << num2 << " = " << resultado;
        break;

    default:
        cout << "Operacion invalida";
}

return 0;
}