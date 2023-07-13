#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct stack
{
    int size;
    int top;
    int *arr;
};

struct stack * createStack(){
    struct stack * stk = (struct stack *)malloc(sizeof(struct stack));
    int size;
    stk->top = -1;
    printf("Enter size of stack: ");
    scanf("%d", &size);
    stk->size = size;
    int arr[size];
    stk->arr = arr;
    return stk;
}

bool isFull(struct stack * s){
    if(s->top == s->size-1){
        return true;
    }
    return false;
}

bool isEmpty(struct stack * s){
    if(s->top == -1){
        return true;
    }
    return false;
}

void peek(struct stack * s){
    if(!isEmpty(s)){
        printf("Top element is: %d\n", s->arr[s->top]);
        return;
    }
    printf("Empty stack\n");
}

void push(struct stack * s, int key){
    if(!isFull(s)){
        s->top++;
        s->arr[s->top] = key;
        printf("Pushed %d\n", key);
        return;
    }
    printf("Stack is full\n");
}

void pop(struct stack * s){
    if(!isEmpty(s)){
        int key = s->arr[s->top];
        s->top--;
        printf("Popped element is: %d\n", key);
        return;
    }
    printf("The stack is empty\n");
}

int main(){
    struct stack * s = NULL;
    while (1)
    {
        printf("1.Create a Stack.\n");
        printf("2.Peek.\n");
        printf("3.Push.\n");
        printf("4.Pop.\n");
        printf("5.Exit\n");
        printf("\n\n");
        int ch;
        printf("Enter your choice: ");
        scanf("%d", &ch);
        if (ch == 1)
        {
            s = createStack();
        }
        else if (ch == 2)
        {
            peek(s);
        }
        else if (ch == 3)
        {
            int val;
            printf("Enter data: ");
            scanf("%d", &val);
            push(s, val);
        }
        else if (ch == 4)
        {
            pop(s);
        }
        
        else if (ch == 5)
        {
            printf("Thank you.");
            break;
        }
        else
        {
            printf("Wrong choice\n\n\n");
            continue;
        }
        printf("\n\n");
    }
 
    return 0;
}