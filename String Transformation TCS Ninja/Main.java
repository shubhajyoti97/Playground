#include <stdio.h>
#include <string.h>

int main()
{
char str[50], str1[50], str2[50],str3[50];
scanf("%s", str);
scanf("%s", str1);
scanf("%s", str2);
scanf("%s",str3)  ;
int i;
for(i = 0; str[i] != '\0'; i++)
{
if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] =='A' || str[i] == 'E'|| str[i] == 'I' || str[i] == 'O'|| str[i] == 'U')
{
str[i] = '$';
}
}
for(i = 0; str1[i] != '\0'; i++)
{
if(str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u' || str1[i] == 'A' || str1[i] == 'E' || str1[i] == 'I' || str1[i] == 'O' || str1[i] == 'U')
{
continue;
}
else
str1[i] = '#';
}
  for(i=0;str2[i]!='\0';i++)
  {
    if (str2[i] >= 'a' && str2[i] <= 'z')
         str2[i] = str2[i] - 32;
  }
  printf("%s%s%s",str,str1,str2);
}
  