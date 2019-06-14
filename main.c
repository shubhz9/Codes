/******************************************************************************

                           Basic pointer Practice 

*******************************************************************************/

#include <stdio.h>

int main()
{
    int a[5]={1,2,3,4,5};
    int *ptr=a;
    
    printf("%d\n",ptr);
    printf("%d",*ptr);
    *ptr++;
    printf("\nAfter Incrementing : %d\n",ptr);
    printf("%d",*ptr);
    
    //Another way to access the array
    printf("\nAfter Incrementing : %d\n",ptr+1);
    printf("%d",*(ptr+1));
}
