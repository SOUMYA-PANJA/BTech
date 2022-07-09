#include <stdio.h>

void chr_occur(char str[], char c)
{
    int count = 0, i = 0;
    while (str[i] != '\0')
    {
        if (str[i] == c)
        {
            count++;
        }
        i++;
    }
    printf("'%c' has occured %d times\n", c, count);
}

int main()
{
    char str[100];
    char c;
    printf("Enter a string: ");
    gets(str);
    printf("Enter the character: ");
    scanf("%c", &c);
    chr_occur(str, c);
    return 0;
}
