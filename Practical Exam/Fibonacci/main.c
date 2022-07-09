#include <stdio.h>

int fib(int n)
{
    if (n == 0 || n == 1)
    {
        return n;
    }
    return fib(n - 1) + fib(n - 2);
}

int main()
{
    int a;
    printf("Enter a number: ");
    scanf("%d", &a);
    printf("The fibonacci series upto %d terms:\n", a);
    for (int i = 0; i < a; i++)
    {
        printf("%d ", fib(i));
    }
    
    return 0;
}