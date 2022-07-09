#include <stdio.h>

int count_word(char str[]){
    int i = 0, word = 0;
    while (str[i] != '\0')
    {
        if (str[i] == ' ' || str[i] == '\n')
        {
            word++;
        }
        i++;
    }
    return word;
}

int count_char(char str[]){
    int i = 0, chr = 0;
    while (str[i] != '\0')
    {
        if ((str[i] > 64 && str[i] < 91) || (str[i] > 96 && str[i] < 123))
        {
            chr++;
        }
        i++;
    }
    return chr;
}

int count_line(char str[]){
    int i = 0, line = 0;
    while (str[i] != '\0')
    {
        if (str[i] == '\n')
        {
            line++;
        }
        i++;
    }
    return line;
}

int main()
{
    char str[] = "This is first line.\nThis is second line.\n";
    printf("The total number of\nWords: %d\nCharacters: %d\nLines: %d\n",count_word(str), count_char(str), count_line(str));
}