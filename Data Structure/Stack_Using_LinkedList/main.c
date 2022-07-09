#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};

struct stack{
    struct Node * head;
};

int isEmpty(struct stack * stk){
    return (stk->head == NULL);
}

struct stack * createStack(){
    struct stack * stk = (struct stack *)malloc(sizeof(struct stack));
    stk->head = NULL;
    return stk;
}

void push(struct stack * stk, int data){
    struct Node * temp = (struct Node *)malloc(sizeof(struct Node));
    if (temp == NULL)
    {
        printf("Overflow...\n");
        return;
    }
    else{
        temp->data = data;
        temp->next = stk->head;
        stk->head = temp;
    }   
}

void pop(struct stack * stk){
    if (isEmpty(stk))
    {
        printf("Underflow....\n");
        return;
    }
    struct Node * temp = stk->head;
    stk->head = temp->next;
    printf("Popped element is: %d\n", temp->data);
    free(temp);
}

void peek(struct stack * stk){
    if (isEmpty(stk))
    {
        printf("Empty List\n");
        return;
    }
    printf("Top item is: %d\n", stk->head->data);
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