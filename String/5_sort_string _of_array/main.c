#include <stdio.h>
#include <string.h>

void words(int a, char str[a][100])
{
    for (int i = 0; i < a; i++)
    {
        printf("Enter word numbeer %d:", i+1);
        scanf("%s", str[i]);
    }
}

void pirntWords(int a, char str[a][100])
{
    for (int i = 0; i < a; i++)
    {
        printf("%s ",str[i]);
    }
    printf("\n");
}

void swap(int p, char str[p][100])
{
    char temp[100];
    strcpy(temp, str[p]);
    strcpy(str[p], str[p+1]);
    strcpy(str[p+1], temp);
}

void sort(int a, char str[a][100])
{
    for (int i = 0; i < a - 1; i++)
    {
        for (int j = 0; j < a - i - 1; j++)
        {
            if (strcmp(str[j],str[j+1])>0)
            {
                swap(j, str);
            }
        }
    }
}

int main()
{
    int a;
    printf("Enter number of words: ");
    scanf("%d", &a);
    char str[a][100];
    words(a, str);
    printf("The words in the array:\n");
    pirntWords(a, str);
    sort(a, str);
    printf("The words in the array:\n");
    pirntWords(a, str);    
    return 0;
}