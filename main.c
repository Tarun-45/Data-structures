#include <stdio.h>
int main()
{
    int i,key;
    int a[20];
    int n;
    printf("array size");
    scanf("%d",&n);
    printf("elements");
    for (i=0;i<n;i++){
        scanf("%d",&a[i]);
        
    }
    printf("key value");
    scanf("%d",&key);
    for(i=0;i<n;i++){
        if(a[i]==key)
            break;
    }
    if(i<n)
        printf("element found%d",i);
    else
        printf("not found");
    
}
