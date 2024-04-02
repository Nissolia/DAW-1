// Este programa muestra el signo zodiacal de una persona. Para ello el usuario debe
// introducir únicamente el día y el mes de nacimiento y el programa determinará
// inmediatamente el signo del zodiaco.
#include <iostream>


using namespace std;

int main () {
    int dia, mes;


    cout<<"Dime tu día de nacimiento.\n";
    cin>>dia;
    cout<<"Dime tu mes de nacimiento.\n";
    cin>>mes;
    
    //se debe calcular que los datos entren correctamente teniendo en cuenta el dia de cada mes
   if (((dia>=21 && dia<=31) && (mes == 3)) || ((dia>=1 && dia<=19) && (mes == 4))){
        cout<<"Eres Aries.\n";

    }else if(((dia>=20 && dia<=30) && (mes == 4)) || ((dia>=1 && dia<=20) && (mes == 5))){
        cout<<"Eres Tauro.\n";

    }else if(((dia>=21 && dia<=30) && (mes == 5)) || ((dia>=1 && dia<=20) && (mes == 6))){
        cout<<"Eres Geminis.\n";
   
    }else if(((dia>=21 && dia<=30) && (mes == 6)) || ((dia>=1 && dia<=22) && (mes == 7))){
        cout<<"Eres Cancer.\n";
   
    }else if(((dia>=23 && dia<=31) && (mes == 7)) || ((dia>=1 && dia<=22) && (mes == 8))){
        cout<<"Eres Leo.\n";
   
    }else if(((dia>=23 && dia<=31) && (mes == 8)) || ((dia>=1 && dia<=22) && (mes == 9))){
        cout<<"Eres Virgo.\n";
   
    }else if(((dia>=23 && dia<=30) && (mes == 9)) || ((dia>=1 && dia<=22) && (mes == 10))){
        cout<<"Eres Libra.\n";
   
    }else if(((dia>=23 && dia<=31) && (mes == 10)) || ((dia>=1 && dia<=21) && (mes == 11))){
        cout<<"Eres Escorpio.\n";
   
    }else if(((dia>=22 && dia<=30) && (mes == 11)) || ((dia>=1 && dia<=21) && (mes == 12))){
        cout<<"Eres Sagitario.\n";
   
    }else if(((dia>=22 && dia<=31) && (mes == 12)) || ((dia>=1 && dia<=19) && (mes == 1))){
        cout<<"Eres Capricornio.\n";
   
    }else if(((dia>=20 && dia<=31) && (mes == 1)) || ((dia>=1 && dia<=18) && (mes == 2))){
        cout<<"Eres Acuario.\n";
   
    }else if(((dia>=19 && dia<=28) && (mes == 2)) || ((dia>=1 && dia<=20) && (mes == 3))){
        cout<<"Eres Piscis.\n";
   
    }else{
        cout<<"No has introducido bien los numeros.\n";
    }
    
    return 0;
    }