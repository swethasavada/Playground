#include<iostream>
int main(){
  int x,y;
  std::cin>>x>>y;
  if (x<y)
    std::cout<<x<<" is smallest number";
  else
    std::cout<<y<<" is smallest number";
}