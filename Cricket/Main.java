#include<iostream>
#include<bits/stdc++.h>  
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  float e,k;
  std::cin>>a>>b>>c>>d;
  e=((float)(d/6))+(float)(d%6)/10;
  k=a/6;
  std::cout<<k<<'\n';
  std::cout<<e<<'\n';
  std::cout<<fixed<<setprecision(1)<<(c/e)<<'\n'<<(b/k)<<'\n';
  if((c/e)>(b/k))
     std::cout<<"Eligible to Win";
 else
    std::cout<<"Not Eligible to Win";
  
}