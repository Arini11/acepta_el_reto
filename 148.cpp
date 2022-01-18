#include <iostream>
using namespace std;

 int main(){
 	
 	int m,h;
 	while(scanf("%d:%d", &h, &m) == 2 && !(h == 00 && m == 00)){
		cout<<24*60-(h*60+m)<<"\n";		
	 }
 }
