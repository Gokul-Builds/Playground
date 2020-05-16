#include<iostream>
using namespace std;
struct complex{
  int real;
  int imag;
};
int main(){
	complex c1,c2;
  int choice;
  cin>>choice>>c1.real>>c1.imag>>c2.real>>c2.imag;
  int a=c1.real*c2.real-c1.imag*c2.imag;
      int b=c1.real*c2.imag+c1.imag*c2.real;
  switch(choice){
    case 1:
      cout<<c1.real+c2.real;
      if(c1.imag+c2.imag<0){
      	cout<<c1.imag+c2.imag<<"i";
      }
        else{
          cout<<"+"<<c1.imag+c2.imag<<"i";
        }
      break;
      case 2:
      cout<<c1.real-c2.real;
      if(c1.imag-c2.imag<0){
      	cout<<c1.imag-c2.imag<<"i";
      }
        else{
          cout<<"+"<<c1.imag-c2.imag<<"i";
        }
      break;
       case 3:
     // a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
//b=((s1.rel)*(s2.img))+((s2.rel)*(s1.img));
      
      cout<<a;
      if(b<0)
        cout<<b<<"i";
      else
        cout<<"+"<<b<<"i";
      break;
    
    default:
      cout<<"Invalid choice";
      
      }
      
  }
