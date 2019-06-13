#include<stdio.h>
int main()
{
  int a,s=0,fdigit,lastdigit;
  scanf("%d",&a);
  lastdigit=a%10;
  fdigit=a;
  while(a>=10)
  {
    a=a/10;
  }
  fdigit=a;
  s=fdigit+lastdigit;
  printf("%d",s);
  return 0;
}