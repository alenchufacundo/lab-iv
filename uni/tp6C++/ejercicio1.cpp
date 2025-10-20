#include <iostream>
using namespace std;

int suma(int num1, int num2){
    int suma = num1 + num2;
    return suma;
}

int main(){
    int n1,n2;
    cout << "Ingrese el primer numero: ";
    cin >> n1;

    cout << "Ingrese el segundo numero: ";
    cin >> n2;

    cout << "la suma es " << suma(n1,n2);

}
