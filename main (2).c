#include<stdio.h>
int main()
{
    int i,k;
    int a[10];
    int n;
    int cou = 0;
    printf("array size");
    scanf("%d",&n);
    printf("elements");
    for (i=0;i<n;i+=1){
        scanf("%d",&a[i]);
        
    }
    printf("key element");
    scanf("%d",&k);
    for (i=0;i<n;i+=1){
        if (a[i]==k){
            cou+=1;
        }
    }
    printf("%d",cou);
    
}
