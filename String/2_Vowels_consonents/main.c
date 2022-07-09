#include <stdio.h>

void vow_con(char str[])
{
    int vow = 0, con = 0, i = 0;
    while (str[i] != '\0')
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
        {
            vow++;
        }
        else if (str[i] == ' ')
        {
        }
        else
        {
            con++;
        }
        i++;
    }
    printf("Number of vowels: %d\n",vow);
    printf("Number of consonents: %d\n",con);
}

int main()
{
    char str[100];
    printf("Enter a string: ");
    gets(str);
    vow_con(str);
    return 0;
}
