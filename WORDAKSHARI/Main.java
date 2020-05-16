#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str1,str2;
  cin>>str1;
  while(str2!="####"){
  	
    cin>>str2;
    int len=str1.length();
    if(str1[len-1]==str2[0]){
    	cout<<str1<<endl;
    }
    else{
    	break;
    	}
    str1=str2;
  }
 cout<<str1;
}