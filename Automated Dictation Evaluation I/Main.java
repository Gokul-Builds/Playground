#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char arr[50];
  char arr2[50];
  cin>>arr;
  cin>>arr2;
  if(strcmp(arr,arr2)==0){
        cout<<"It is correct";
    return 0;
      
  }
  cout<<"It is wrong";
}