/* Hacer un programa para ayudar a un trabajador a
saber cuál será su sueldo semanal, se
 sabe que, si trabaja 40 horas o menos, se le pagará
 20€ por hora, pero si trabaja más de
 40 horas entonces las horas extras se le pagarán a
 25€ por hora. ¿Cuánto cobra a final de
 mes? */


#include <iostream>

using namespace std;

int main () {
    double horaSemana, horarioLaboral;

    cout<<"Introduce las horas semanales que trabajas.\n";
    cin>>horaSemana;

    //Miramos que los valores introducidos sean correctos
    if((horaSemana <= 40) && (horaSemana >= 0)){
        cout<<"Se te va a pagar "<< horaSemana * 20 <<" en total.\n";
        
    }else if (horaSemana > 40){
    //al confirmar que son mayores dividimos las horas entre las que se pagan x 20 o 25
        horarioLaboral = 40;
        horaSemana = horaSemana - horarioLaboral;
        cout<<"Se te va a pagar "<< horarioLaboral * 20 <<" en tu horario laboral.\n";
        cout<<"Se te va a pagar "<< horaSemana * 25 <<" por las horas extras.\n";
        
    }else{
        cout<<"Has introducido mal las horas.\n";
    }

    return 0;
    }