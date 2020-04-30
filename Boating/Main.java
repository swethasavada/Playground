#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,a,c;
  std::cin>>b>>a>>c;
  if (b-(75*a+30*c)>0)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}