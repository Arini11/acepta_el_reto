#include <bits/stdc++.h>
using namespace std;

bool casProva(){
    int n,suma=0;
    cin>>n;
    if(n==0) return false;
    int quant[n];
    for(int i=0;i<n;i++)
        cin>>quant[i];
    for(int i=0;i<n;i++)
        suma+=quant[n-1]-quant[i];
    cout<<suma<<"\n";
return true;
}

int main(){
    /* int n; */
    /* cin>>n; */
    /* while(n--) */
    /*     casProva(); */
    while(casProva());
return 0;
}
