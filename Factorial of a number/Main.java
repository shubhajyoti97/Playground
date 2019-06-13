#include <stdio.h>
int main() {
	int num,i,factorial=1;
  scanf("%d",&num);
  
  {
    for(i=1;i<=num;++i)
    {
      factorial=factorial*i;
    }
    printf("%d",factorial);
  }
  
    return 1;
	return 0;
}