#include <stdio.h>

void up_to_lw(char str[], int a)
{
    int i = 0;
    while (str[i] != '\0')
    {
        if (str[i] > 64 && str[i] < 91)
        {
            str[i] = str[i] + 96 - 64;
        }
        i++;
    }
}

void lw_to_up(char str[], int a)
{
    int i = 0;
    while (str[i] != '\0')
    {
        if (str[i] > 97 && str[i] < 123)
        {
            str[i] = str[i] - 96 + 64;
        }
        i++;
    }
}

int main(){
    char str1[100];
    char str2[100];
    printf("Enter a string in uppercase: ");
    gets(str1);
    printf("Enter a string in lowercase: ");
    gets(str2);
    up_to_lw(str1,100);
    lw_to_up(str2,100);
    printf("The first string now: %s\n", str1);
    printf("The second string now: %s\n", str2);
    return 0;
}