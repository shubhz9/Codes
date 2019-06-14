/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

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
    
    
    printf("\nAfter Incrementing : %d\n",ptr+1);
    printf("%d",*(ptr+1));
}
