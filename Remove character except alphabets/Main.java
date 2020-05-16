#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  for(int i=0;i<s.length();i++){
  	if((s[i]>=65&&s[i]<=90)||(s[i]>=97&&s[i]<=122))
      cout<<s[i];
  }
}