#include <bits/stdc++.h>
using namespace std;

void casoDePrueba(){
	int x,y;cin>>x>>y;

	if((x*y)%2==0){
		cout<<(x*y)/2<<" "<<(x*y)/2<<"\n";
	}else{
		cout<<trunc((x*y)/2)+1<<" "<<trunc((x*y)/2)<<"\n";
	}

}
int main(){
	int n;cin>>n;
	while(n--) casoDePrueba();
	return 0;
}
