// Si lo ejecutas veras un menú con el código de ciertos artículos. Haz un programa como si fueras
// una tienda online. Introduciendo el código de un articulo, nos dirá el precio. Nos preguntará si
// queremos comprar y cuantas unidades del mismo, para finalmente decirnos cuanto debemos
// pagar.



#include <iostream>

using namespace std;

int main () {
    int producto, cantidad;
    


    cout<<"\t\tELIJA EL PRODUCTO DESEADO:\n\n";
    cout<<"\t\tPRODUCTO\t\t\tCODIGO\n\n";
    cout<<"\t\tCAMISA........................... 1 - 10 euros\n";
    cout<<"\t\tCINTURON......................... 2 - 5 euros\n";
    cout<<"\t\tZAPATOS.......................... 3 - 25 euros\n";
    cout<<"\t\tPANTALON......................... 4 - 15 euros\n";
    cout<<"\t\tCALCETINES....................... 5 - 5 euros\n";
    cout<<"\t\tFALDAS........................... 6 - 20 euros\n";
    cout<<"\t\tGORRAS........................... 7 - 10 euros\n";
    cout<<"\t\tSUETER........................... 8 - 20 euros\n";
    cout<<"\t\tCORBATA.......................... 9 - 8 euros\n";
    cout<<"\t\tCHAQUETA......................... 10 - 28 euros\n";
    cin>>producto;

    cout<<"Cuantas unidades quieres tomar?\n";
    cin>>cantidad;

    if (cantidad > 0){
    // hacemos una comprobación para que añada correctamente la cantidad

        switch (producto){
        // en cada switch se muestra el precio total de lo que compra
            case 1:
                cout<<"Son "<<cantidad*10<<" euros.\n";
                break;

            case 2:
                cout<<"Son "<<cantidad*5<<" euros.\n";
                break;
                    
            case 3:
                cout<<"Son "<<cantidad*25<<" euros.\n";
                break;

            case 4:
                cout<<"Son "<<cantidad*15<<" euros.\n";
                break;

            case 5:
                cout<<"Son "<<cantidad*5<<" euros.\n";
                break;

            case 6:
                cout<<"Son "<<cantidad*20<<" euros.\n";
                break;

            case 7:
                cout<<"Son "<<cantidad*10<<" euros.\n";
                break;

            case 8:
                cout<<"Son "<<cantidad*20<<" euros.\n";
                break;

            case 9:
                cout<<"Son "<<cantidad*8<<" euros.\n";
                break;

            case 10:
                cout<<"Son "<<cantidad*28<<" euros.\n";
                break;
                
            default:
                cout<<"Has puesto mal el codigo\n";
                break;
            }
    }else{
            cout<<"Has introducido mal la cantidad\n";
    }

    return 0;
    }