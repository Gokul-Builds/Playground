#include<iostream>
#include<string>
#include <bits/stdc++.h>
using namespace std;
int main() 
{ 
//Type your code here
  string str;
  getline(cin,str);
  //cout<<str;
  /*for(int i=str.length()-1;i>=0;i--){
  	cout<<str[i];
  }*/
reverse(str.begin(),str.end());
  cout<<str;
  
}