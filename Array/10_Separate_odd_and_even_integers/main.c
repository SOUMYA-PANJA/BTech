#include <stdio.h>

void array(int arr[], int size){
    for (int i = 0; i < size; i++)
    {
        printf("Enter element for index %d: ",i);
        scanf("%d",&arr[i]);
    }
}

void printArray(int arr[], int size){
    for (int i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}

void oddEvenArray(int arr[], int odd[], int even[], int size){
    int oddcount = 0, evencount = 0;
    for (int i = 0; i < size; i++)
    {
        if (arr[i]%2 == 0)
        {
            even[evencount] = arr[i];
            evencount++;
        }
        else
        {
            odd[oddcount] = arr[i];
            oddcount++;
        }
        
    }
    printf("The even elements are: ");
    printArray(even, evencount);
    printf("The odd elements are: ");
    printArray(odd, oddcount);
    
}

int main(){
    int x;
    printf("Enter number of elements: ");
    scanf("%d",&x);
    int arr[x], odd[x], even[x];
    array(arr, x);
    oddEvenArray(arr, odd, even, x);
    return 0;
}