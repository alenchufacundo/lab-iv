#include <iostream>
using namespace std;

int main() {
int a,b;
double c;
a=6;
b=9;
c=7.5;
a=b;
b=c;
c=a;
cout << "EL valor de a es: "<< a <<endl;
cout << "EL valor de b es: "<< b <<endl;
cout << "EL valor de c es: "<< c <<endl;
return 0;
}