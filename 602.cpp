#include <bits/stdc++.h>
using namespace std;

void casoDePrueba(){
	
	int n,aux,total=2,a=1,b=1,i=2;
	scanf("%d",&n);
	while(total<n && n!=1){
		aux=b;
		b+=2*a;
		a=aux;
		total+=b;
		i++;
	}
	if(n!=1)
		cout<<i<<"\n";
	else cout<<1<<"\n";
}

int main(){
	int n;cin>>n;
	while(n--) casoDePrueba();
	return 0;
}
