#include <iostream>
using namespace std;
void casProva(){
    short a,b;
    cin>>a>>b;
    cout<<b-a<<"\n";
}
int main(){
    ios_base::sync_with_stdio(0);
    short n;
    cin>>n;
    while(n--)
        casProva();
return 0;
}
