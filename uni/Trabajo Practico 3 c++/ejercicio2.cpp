#include <iostream>
using namespace std;

int main(){
    int num1,num2,num3;
    cout << "Ingrese un numero: ";
    cin >> num1;
    cout << "Ingrese un numero: ";
    cin >> num2;
    cout << "Ingrese un numero: ";
    cin >> num3;

    if (num1>num2 and num1>num3)
    {
        cout << "El primer numero (" << num1 << ") es el mayor";
    } else{
        if (num3 > num1 and num3>num2)
        {
            cout << "El tercer numero (" << num3 << ") es el mayor";
        } else{
            cout << "El segundo numero (" << num2 << ") es el mayor";
        }
        
    }
    
}