#include <stdio.h>
 
void main()
{
   long int  num, binary_val;
  int decimal_val = 0, base = 1, rem;
 
    
    scanf("%ld", &num); 
    binary_val = num;
    while (num > 0)
    {
        rem = num % 10;
        decimal_val = decimal_val + rem * base;
        num = num / 10 ;
        base = base * 2;
    }
  printf("%d",decimal_val);
}
  