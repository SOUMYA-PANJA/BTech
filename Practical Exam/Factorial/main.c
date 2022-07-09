#include <stdio.h>

int fact(int n)
{
    if (n < 2)
    {
        return 1;
    }
    return n * fact(n - 1);    
}

int main()
{
    int a;
    printf("Enter a number: ");
    scanf("%d", &a);
    printf("Factorial of %d is: %d", a, fact(a));
    return 0;
}