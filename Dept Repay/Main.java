#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  float i,a,d,f;
  std::cin>>p;std::cin>>r;std::cin>>t;
  i=(p*t*r)/100;
  a=p+i;
  d=(i*2)/100;
  f=a-d;
  std::cout<<i<<"\n";
  std::cout<<a<<"\n";
  std::cout<<d<<"\n"<<f;
}