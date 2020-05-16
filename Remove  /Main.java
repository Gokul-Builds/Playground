#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  string rem="the ";
  //cout<<s;
  size_t pos=string::npos;
  //size_t pos=str.find(rem);
  //cout<<pos;
  while((pos=str.find(rem))!=string::npos){
    str.erase(pos,rem.length());}
  cout<<str;
  
}
/*void eraseAllSubStr(std::string & mainStr, const std::string & toErase)
{
	size_t pos = std::string::npos;
 
	// Search for the substring in string in a loop untill nothing is found
	while ((pos  = mainStr.find(toErase) )!= std::string::npos)
	{
		// If found then erase it from string
		mainStr.erase(pos, toErase.length());
	}
}*/