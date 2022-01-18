#include <bits/stdc++.h>
using namespace std;

int main(){
string rei;int n;
while(scanf("%d",&n)==1 && n!=0){
	map<string,int> m;
	while(n--){
		cin>>rei;
		m[rei]++;
	}
	scanf("%d",&n);
	while(n--){
		cin>>rei;
		cout<<m[rei]+1<<"\n";
		m[rei]++;
	}
	cout<<"\n";
}
return 0;
}
