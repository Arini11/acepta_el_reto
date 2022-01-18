#include <bits/stdc++.h>
using namespace std;

int main(){
    int d,n;
    while(scanf("%d%d",&d,&n)==2){
        int min,v1,v2; cin>>v1; min=v1;
        bool apta = true;
        for(int i=0;i<n-1;i++){
            cin>>v2;
            if(v1==v2){	
            	min = v1;	
			}
            else if(v2>v1){
            	if(v2-min > d) {apta = false;}
			}
			else min = v2;
			
            v1=v2;
        }
        
        //if(v2>min && v1-min>d) apta = false;
        
        if(apta) cout<<"APTA\n";
        else cout<<"NO APTA\n";
    }
    return 0;
}
