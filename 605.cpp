#include <bits/stdc++.h>
using namespace std;

bool casoDePrueba(){

    int V=0,I=0;
    char n;
    cin>>n;
    if(n=='.') return false;
    while(n!='.'){
        if(n=='V'){
            ++V;
        }else if(n=='I'){
            ++I;
        }else if(n=='A'){
            ++V;++I;
        }
        cin>>n;
    }
    if(V>I){
        cout<<"VERANO\n";
    }else if(V<I){cout<<"INVIERNO\n";
    }else if(V==I){cout<<"EMPATE\n";}

return true;
}
int main(){
    while(casoDePrueba());
return 0;
}
