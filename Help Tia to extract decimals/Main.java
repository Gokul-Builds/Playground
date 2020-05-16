#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
	//Type your code here
  cin>>fnum;
  //size_t pos=fnum.find(".");
  //cout<<pos;
  cout<<"Floating part is : ";//<<fnum.substr(pos+1);
  if(fnum.find(".")!=string::npos){
    size_t pos=fnum.find(".");
    cout<<fnum.substr(pos+1);
  }
  
    
}