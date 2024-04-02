// Desarrolla en pseudocódigo un examen �po test de 5 preguntas, cada una tendrá 3
// opciones. Por cada pregunta acertada se sumará 2 puntos, por cada fallo se resta 0.4.
// (Las preguntan pueden ser las que quieras)
// Al terminar el �po test muestre la nota que ha sacado en ese examen.

#include <iostream>
using namespace std;

double acierto(double num);
double fallo(double num);

int main() {
    int respuesta;
    double notaTest = 0, notaPracticas = 0;


    cout<<"1) ¿Quien es el mejor profe? 1|Rufo    2|Jose Maria    3|Lolo";
    cin>>respuesta;
    if(respuesta == 1){
        cout<<"Has acertado";
        notaTest = acierto(notaTest);
    }else{
        cout<<"Muy mal que no te lo sepas";
        notaTest = fallo(notaTest);
    }
    cout<<"2) ¿Quien es el mejor profe? 1|Rufo    2|Jose Maria    3|Lolo";
    cin>>respuesta;
    if(respuesta == 1){
        cout<<"Has acertado";
        notaTest = acierto(notaTest);
    }else{
        cout<<"Muy mal que no te lo sepas";
        notaTest = fallo(notaTest);
    }
    cout<<"3) ¿Quien es el mejor profe? 1|Rufo    2|Jose Maria    3|Lolo";
    cin>>respuesta;
    if(respuesta == 1){
        cout<<"Has acertado";
        notaTest = acierto(notaTest);
    }else{
        cout<<"Muy mal que no te lo sepas";
        notaTest = fallo(notaTest);
    }
    cout<<"4) ¿Quien es el mejor profe? 1|Rufo    2|Jose Maria    3|Lolo\n";
    cin>>respuesta;
    if(respuesta == 1){
        cout<<"Has acertado\n";
        notaTest = acierto(notaTest);
    }else{
        cout<<"Muy mal que no te lo sepas\n";
        notaTest = fallo(notaTest);
    }
    cout<<"5) ¿Quien es el mejor profe? 1|Rufo    2|Jose Maria    3|Lolo\n";
    cin>>respuesta;
    if(respuesta == 1){
        cout<<"Has acertado\n";
        notaTest = acierto(notaTest);
    }else{
        cout<<"Muy mal que no te lo sepas\n";
        notaTest = fallo(notaTest);
    }

    cout<<"\n\n\tTu nota en este test es de "<<notaTest<<" sobre 10\n";

    notaTest = notaTest * 0,4;
    notaPracticas = 7 * 0,6;

    cout<<"Tu nota en total es de "<<notaPracticas + notaTest<<" sobre 10\n";



// Después el programa debe calcular y mostrar la nota final del alumno. El examen que
// acaba de hacer (el �po test) vale el 40% de la nota y el 60% restante son las prác�cas,
// supongamos que hemos sacado un 7 de media en las prac�cas. Imprima por pantalla la
// nota final del alumno.
    return 0;
}

double acierto(double num){
    return num + 2;
}
double fallo(double num){
    return num - 0,4;
}