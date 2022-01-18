#include <bits/stdc++.h>
using namespace std;

bool casoDePrueba(){

    int n,t,i=0;
    bool flag = true;
    cin>>n;
    if(n==0) return false;
    while(n--){
        cin>>t;
        if(!flag&&t>6) flag=true;
        if(flag&&t<=4){
            flag=false;
            ++i;
        }
    }
    cout<<i<<"\n";

return true;
}
int main(){
    while(casoDePrueba());
return 0;
}
