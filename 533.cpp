#include <bits/stdc++.h>
using namespace std;

void casProva(){
    int i=1,n,quant,suma=0;
    cin>>n;
    cin>>quant;
    for(;quant!=0;i++){
        suma+=quant;
        if(suma>=n*8){
            cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
            break;
        }
        cin>>quant;
    }
    if(quant==0) cout<<"SIGAMOS RECICLANDO\n";
    else cout<<i<<"\n";
}

int main(){
    int n;
    cin>>n;
    while(n--)
        casProva();
return 0;
}
