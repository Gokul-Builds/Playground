#include<iostream>
using namespace std;
struct time{
	int hour;
  int min;
  int sec;
}t1,t2;
int main()
{
  //Type your code here.
  cin>>t1.hour>>t1.min>>t1.sec;
  cin>>t2.hour>>t2.min>>t2.sec;
  if(t1.sec<t2.sec){
    t1.min=t1.min-1;
  t1.sec+=60;
  }
  if(t1.min<t2.min){
  	t1.hour=t1.hour-1;
    t1.min+=60;
  }
  cout<<t1.hour-t2.hour<<":"<<t1.min-t2.min<<":"<<t1.sec-t2.sec;
}