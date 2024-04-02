#include <iostream> 

using namespace std;

// Un programa que le introduzcas 4 números por teclado y los imprima en orden
// de mayor a menor.
int main() {
    int num1, num2, num3, num4;

    do{
        cout<<"Introduce los cuatro numeros para ponerlos de mayor a menor: ";
        cin>>num1>>num2>>num3>>num4;
    } while ((num1 <= 0 && num2 <= 0 && num3 <= 0 && num4 <= 0) && (num1 == num2 || num2 == num3 || num3 == num4));
    cout<<"\n";
    
    //comprobamos mayores
    if (num1>num2 && num1>num3 && num1>num4){
        cout<<num1<<"  ";
    }else if(num2>num1 && num2>num3 && num2>num4){
        cout<<num2<<"  ";
    }else if(num3>num1 && num3>num2 && num3>num4){
        cout<<num3<<"  ";
    }else if(num4>num1 && num4>num2 && num4>num3){
        cout<<num4<<"  ";}

   //segundos
    if (num1 < num2 || num1 < num3 || num1 < num4){
        cout<<num1<<"  ";
    }else if(num2 < num1 || num2 < num3 || num2 < num4){
        cout<<num2<<"  ";
    }else if(num3 < num2 || num3 < num1 || num3 < num4){
        cout<<num3<<"  ";
    }else if(num4 < num2 || num4 < num3 || num4 < num1){
        cout<<num4<<"  ";}


//comprobamos menores
    if (num1<num2 && num1<num3 && num1<num4){
        cout<<num1<<"  ";
    }else if(num2<num1 && num2<num3 && num2<num4){
        cout<<num2<<"  ";
    }else if(num3<num1 && num3<num2 && num3<num4){
        cout<<num3<<"  ";
    }else if(num4<num1 && num4<num2 && num4<num3){
        cout<<num4<<"  ";}



    return 0;
}
