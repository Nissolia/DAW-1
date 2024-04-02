#include <iostream>

using namespace std;
// Programa que permita introduciendo una fecha saber que signo del zodiaco es esa persona.
// Y nos diga si nacimos en año par o impar. Incluir todas las comprobaciones posibles. (No puede
// ser 35 de Mayo, tampoco 29 de febrero a no ser que sea un año bisiesto, etc). - añadir funcionalidad
int signoZodiaco(int dia, int mes);
int anio(int ano);
void bisiesto();

int main(){
    int dia, mes, ano;

    cout<<"Dime tu día de nacimiento.\n";
    cin>>dia;
    cout<<"Dime tu mes de nacimiento.\n";
    cin>>mes;
    cout<<"Dime tu anio de nacimiento.\n";
    cin>>ano;

    bisiesto();
    anio(ano);
    signoZodiaco(dia, mes);
    
    return 0;
}



/*
* Funcion en la que introduces tu año y mes de nacimiento y te dice que signo tienes
* Entrada: dia y mes
* Salida: dia y mes
*/
int signoZodiaco(int dia, int mes){    
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
   
    }else if(((dia>=19 && dia<=29) && (mes == 2)) || ((dia>=1 && dia<=20) && (mes == 3))){
        cout<<"Eres Piscis.\n";
   
    }else{
        cout<<"No has introducido bien los numeros.\n";
    }

    return dia, mes;
}

/*
* Funcion en la que introduces el dato año y te dice si es par o impar
* Entrada: ano
* Salida: ano
*/
int anio(int ano){
    if (ano % 2 == 2)
    {
        /* code */
    }
    
}

void bisiesto(){

}