#include <bits/stdc++.h>
using namespace std;

int casoDePrueba(){
	long long int pes,n;
	scanf("%lld", &pes);
	if(pes==0) return 0;
	scanf("%lld",&n);
	long long int suma=0;
	while(n!=0){
		pes-=n;
		if(pes>=0) suma++;
		scanf("%lld",&n);
	}
	printf("%d\n",(int)suma);
return 1;
}

int main(){
	while(casoDePrueba());
	return 0;
}
