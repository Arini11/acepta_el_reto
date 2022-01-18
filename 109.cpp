#include <bits/stdc++.h>
using namespace std;

int main(){
string t1,t2,nom,n1,n2;
while(cin>>t1)  {
	if(t1=="FIN") return 0;
	map<string,int> m;
	int compt=0;
	while(1){
		cin>>t1;
		if(t1=="FIN") break;
		cin>>n1>>t2>>n2;
		if(n1>n2){
			m[t1]+=2;
			m[t2]+=1;
		}
		else{
			m[t2]+=2;
			m[t1]+=1;
		}
		++compt;

	}
	int ant=0;string nom; bool empat=false;
	map<string,int>::iterator it = m.begin();
	for(;it!=m.end();++it){
		if(it->second > ant){ant=it->second;nom=it->first;empat=false;}
		else if(it->second==ant) empat=true;
	}
	if(empat)
		cout<<"EMPATE "<< (m.size()*(m.size()-1)) - compt<<"\n";
	else cout<<nom<<" "<<(m.size()*(m.size()-1)) - compt<<"\n";
}
return 0;
}
