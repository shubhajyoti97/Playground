#include<stdio.h>
int main()
{
  int n,secondlast;
  scanf("%d",&n);
  secondlast=((n%100)/10);
  printf("%d",secondlast);
    
  return 0;
}