#include <stdio.h>

int sum(int n)
{
    if (n < 1)
    {
        return 0;
    }
    return (n % 10) + sum(n / 10);
}

int main()
{
    int a;
    printf("Enter a number: ");
    scanf("%d", &a);
    printf("The sum of the digits in %d is : %d", a, sum(a));
    return 0;
}