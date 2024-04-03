#include <iostream>
#include <cmath>
#include <cstring>

using namespace std;

int main () {
    int i = 0;

    for ( i = 0; i < 5; i++)
    {
        cout<<i<<"FOR\n";
    }

    while (i<5){
        cout<<i<<"WHILE\n";
        i++;
    }

    do
    {
        cout<<"Mete numero\n";
        cin>>i;
    } while (i>0);
    

    return 0;
}