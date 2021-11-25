
#include<stdio.h>
int main()
{
    int i;
    int a[10];
    int n;
    int cou = 0;
    printf("array size");
    scanf("%d",&n);
    printf("elements");
    for (i=0;i<n;i+=1){
        scanf("%d",&a[i]);
        
    }
    for (i=0;i<n;i+=1){
        if (a[i]==i){
            cou+=1;
        }
    
    }
    if (cou>1){
        printf("duplicates  are present");
    }
    else{
        printf("no duplicates");
    }
    
}
