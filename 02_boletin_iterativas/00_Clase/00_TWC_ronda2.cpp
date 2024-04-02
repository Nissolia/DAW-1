#include <iostream>

using namespace std;

int main () {
    int num, num1, num2, contador;

    cout<<"SEGUNDA RONDA!!\n\n";

    cout<<"Dime la cantidad de numeros fibonacci que quieres ver en pantalla: ";
    cin>>contador;
    
    if (contador == 1){
        cout<<" 0 ";
    }else if(contador == 2){
        cout<<" 0 - 1 ";
    }else if (contador == 3){
        cout<<" 0 - 1 - 1 ";
    }else if(contador >= 4){
        cout<<" 0 - 1 - 1";
        contador = contador - 3;
        num = 1;
        num1 = 1;
        num2 = 0;

        do{
            num2 = num;
            num = num1;
            num1 = num1 + num2;
            contador = contador - 1;
            cout<<" - "<<num1;
            
        } while (contador > 0);
        
    }else{
        cout<<"Has introducido un numero incorrecto.\n";
    }
    


    
    return 0;
}