#include <stdio.h>

void rev(int n)
{
    int remainder, rev = 0;
    while (n != 0)
    {
        remainder = n % 10;
        rev = rev * 10 +remainder;
        n /= 10;
    }
    printf("The number in reverse order: %d", rev);
}

int main()
{
    int a;
    printf("Enter a number: ");
    scanf("%d", &a);
    rev(a);
    return 0;
}