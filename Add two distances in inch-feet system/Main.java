#include<iostream>
using namespace std;
struct dist{
	float feet;
  	float inch;
}d1,d2,d3;
int main()
{
  //Type your code here.
  cin>>d1.feet>>d1.inch;
  cin>>d2.feet>>d2.inch;
  d3.inch=d1.inch+d2.inch;
  d3.feet=d1.feet+d2.feet;
  if(d3.inch>=12)
  {
    d3.feet++;
    d3.inch=d3.inch-12;
  }
  cout<<d3.feet<<"'-"<<d3.inch<<"\"";
    
}