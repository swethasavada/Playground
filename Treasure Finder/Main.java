#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
  if(x>y && x>z){
        if(y>z){
            std::cout<<"The treasure is in box which has number "<<y;
            if(y%z==0 && x%z==0)
                std::cout<<"\nThe code to open the box is "<<z;
            else
            std::cout<<"\nThe code to open the box is 1";
        }
        else{
        std::cout<<"The treasure is in box which has number "<<z;
        if(z%y==0 && x%y==0)
                std::cout<<"\nThe code to open the box is "<<y;
            else
            std::cout<<"\nThe code to open the box is 1";
        }
        }
    
    else if(y>x && y>z){
        if(x>z){
        std::cout<<"The treasure is in box which has number "<<x;
            if(y%z==0 && x%z==0)
                std::cout<<"\nThe code to open the box is "<<z;
            else
                std::cout<<"\nThe code to open the box is 1";
        }
        else{
        std::cout<<"The treasure is in box which has number "<<z;
        if(z%x==0 && y%x==0)
                std::cout<<"\nThe code to open the box is "<<x;
            else
            std::cout<<"\nThe code to open the box is 1";
        }
    }
    else{
        if(x>y){
        std::cout<<"The treasure is in box which has number "<<x;
        if(z%y==0 && x%y==0)
                std::cout<<"\nThe code to open the box is "<<y;
            else
            std::cout<<"\nThe code to open the box is 1";
        }
        else{
        std::cout<<"The treasure is in box which has number "<<y;
        if(z%x==0 && y%x==0)
                std::cout<<"\nThe code to open the box is "<<x;
            else
            std::cout<<"\nThe code to open the box is 1";
        }
    }
}
  