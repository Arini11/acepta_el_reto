#include <iostream>
using namespace std;

bool casProva(){
	int casos; cin>>casos;
	if(!cin) return false;
	int n,i=2,ant=0;
	cin>>n;
	cout<<n;
	ant=n;
	casos--;
	while(casos--){
		cin>>n;
		cout<<" "<<i*n-ant;
		ant=i*n;
		i++;
	}	
	cout<<"\n";
return true;	
}
int main(){
	while(casProva());
return 0;
}
