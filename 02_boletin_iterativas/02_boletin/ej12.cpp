#include <iostream>
#include <math.h>
using namespace std;

int main() {
    double  num1, num2;

    cout<<"Sabremos el resultado de la fórmula: f(x,y)\n";
    cin>>num1>>num2;

    cout<<"El resultado es: "<<(sqrt(num1))/(pow(num2, 2) - 1);

    return 0;
}
