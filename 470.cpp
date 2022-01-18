#include <bits/stdc++.h>
using namespace std;

int main(){
	  string str;
    //rojo,amarillo,verde
    while(getline(cin,str)){
        if(str!=""){
        int r=0,a=0,v=0;
        //rojo=r amarillo=a
        vector<char> col;
        for(int i=0;i<str.length();i++){
            if(str[i]=='R'){++r;col.push_back('r');}
            else if(str[i]=='A' && r>0 && col.back()=='r'){++a;col.push_back('a');}
            else if(str[i]=='V' && r>0 && a>0 && col.back()=='a'){++v;--r;--a;col.pop_back();col.pop_back();}
            else while(!col.empty()) col.pop_back();
        }
        cout<<v<<"\n";
        }
    }
    return 0;
}
