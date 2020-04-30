#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    int unit;
    int amt;
    std::cin>>unit;
	if(unit <= 200)
    {
        amt = unit * 0.50;
    }
    else if(unit <= 400)
    {
        amt = 100+ (unit * 0.65);
    }
    else if(unit <= 600)
    {
        amt = 200 + (unit * 0.80);
    }
    else
    {
        amt = 425+ (unit * 1.50);
    }
  
    

    std::cout<<"Rs."<<amt;

    return 0;

}