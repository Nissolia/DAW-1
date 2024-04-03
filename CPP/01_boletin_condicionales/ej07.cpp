// Programa que pida un número del 1 al 12 y diga el nombre del mes correspondiente

#include <iostream>

using namespace std;

int main () {
    int mes;

    cout<<"Dime un numero del 1 al 12 y te digo a que mes corresponde con una cancion.\n";
    cin>>mes;
    
    switch (mes)
    {
    case 1:
        cout<<"Enero.\n";
        break;
    
    case 2:
        cout<<"Febrero\n";
        break;
    
    case 3:
        cout<<"Marzo\n";
        break;

    case 4:
        cout<<"Abril\n";
        break;
    
    case 5:
        cout<<"Mayo\n";
        break;
    
    case 6:
        cout<<"Junio\n";
        break;
    
    case 7:
        cout<<"Julio\n";
        break;
    
    case 8:
        cout<<"Agosto\n";
        break;
    
    case 9:
        cout<<"Septiembre\n";
        break;

    case 10:
        cout<<"Octubre\n";
        break;
    
    case 11:
        cout<<"Noviembre\n";
        break;
    
    case 12:
        cout<<"Diciemnbre\n";
        break;
    
    default:
        cout<<"No has introducido un numero correcto\n";
        break;
    }
        
    return 0;
    }