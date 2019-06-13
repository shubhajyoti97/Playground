#include <stdio.h>
 
main()
{
    int num, last,sum=0;
    
    scanf("%d", &num);
 
    last = num%10;
    
 
    while(num>=10)
    {
        num = num/10;
    }
 
    sum=num+last;
  printf("%d",sum);
}