#include<stdio.h>
int main()
{
 int i,j,n,isPrime,sum=0;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {    
        isPrime = 1;
        for(j=2; j<=i/2 ;j++)
        {
            if(i%j==0)
            {     
                isPrime = 0;
                break;
            }
        }

      
        if(isPrime==1)
        {
            sum += i;
        }
    } 
  printf("%d",sum);
  
  return 0;
}