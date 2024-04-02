#include <iostream>

using namespace std;

int main () {
    int num;

    cout<<"PRIMERA RONDA!!\n";
    do{
        cout<<"Te dire si cada numero tecleado es positivo o negativo.\n";
        cout<<"Pararemos al escribir un 0: ";
        cin>>num;
        
        if (num<0){
            cout<<"El numero introducido es NEGATIVO.\n\n";
        }else{
            cout<<"El numero introducido es POSITIVO.\n\n";
        }
        
    } while (num != 0);
    
    return 0;
}