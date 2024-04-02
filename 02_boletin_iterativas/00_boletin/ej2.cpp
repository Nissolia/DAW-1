// Crea una función que calcule la letra del DNI a partir de los números (Lo tenéis
// hecho en pseint solo tenéis que convertirlo)

#include <iostream> 

using namespace std;

int main() {
    int dni, letra;

    cout<<"Dime los numeros de tu DNI y te dire tu letra: ";
    cin>>dni;

    letra = dni % 23;

    switch (letra){
    case 0:
        cout<<dni<<" con la letra T.";
        break;

    case 1:
        cout<<dni<<" con la letra R.";
        break;

    case 2:
        cout<<dni<<" con la letra W.";
        break;

    case 3:
        cout<<dni<<" con la letra A.";
        break;

    case 4:
        cout<<dni<<" con la letra G.";
        break;

    case 5:
        cout<<dni<<" con la letra M.";
        break;

    case 6:
        cout<<dni<<" con la letra Y.";
        break;

    case 7:
        cout<<dni<<" con la letra F.";
        break;

    case 8:
        cout<<dni<<" con la letra P.";
        break;

    case 9:
        cout<<dni<<" con la letra D.";
        break;

    case 10:
        cout<<dni<<" con la letra X.";
        break;

    case 11:
        cout<<dni<<" con la letra B.";
        break;

    case 12:
        cout<<dni<<" con la letra N.";
        break;

    case 13:
        cout<<dni<<" con la letra J.";
        break;

    case 14:
        cout<<dni<<" con la letra Z.";
        break;

    case 15:
        cout<<dni<<" con la letra S.";
        break;

    case 16:
        cout<<dni<<" con la letra Q.";
        break;

    case 17:
        cout<<dni<<" con la letra V.";
        break;

    case 18:
        cout<<dni<<" con la letra H.";
        break;

    case 19:
        cout<<dni<<" con la letra L.";
        break;

    case 20:
        cout<<dni<<" con la letra C.";
        break;

    case 21:
        cout<<dni<<" con la letra K.";
        break;

    case 22:
        cout<<dni<<" con la letra E.";
        break;

    default:
        cout<<"Has introducido más los números.";
        break;
    }

    return 0;
}