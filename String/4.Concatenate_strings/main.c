#include <stdio.h>

void concat(char str1[], char str2[])
{
    int i = 0, count = 0;
    while (str1[i] != '\0')
    {
        i++;
    }
    i--;
    while (str2[count] != '\0')
    {
        str1[i] = str2[count];
        i++;
        count++;
    }
    str1[i] = '\0';
}

int main()
{
    char str1[100], str2[100];
    printf("Enter a string1: ");
    gets(str1);
    printf("Enter a string2: ");
    gets(str2);
    concat(str1, str2);
    printf("%s",str1);
    return 0;
}