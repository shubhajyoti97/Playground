#include <stdio.h>
int main() {
	int number,second_digit;
  scanf("%d",&number);
  while(number>100)
  {
    number=number/1000;
    number=number%10;
  }
  
    while(number>=10)
    {
        number = number%10;
    }
  printf("%d",number);

	return 0;
}