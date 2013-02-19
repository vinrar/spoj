#include<stdio.h>
#include<stdlib.h>

int compare (const void * a, const void * b)
{
  return ( *(int*)a - *(int*)b );
}

int main(){
    int n,f,i,a[1000],count=0,k=1;
    long int sum,checksum;
    scanf("%d",&n);
    while(n){
        count =0;checksum=0;
        scanf("%ld",&sum);
        scanf("%d",&f);
        for(i=0;i<f;i++){
            scanf("%d",&a[i]);
        }
        qsort (a, f, sizeof(int), compare);
        while(f){
            count+=1;
            checksum = checksum + a[f-1];
            if(checksum >= sum){printf("Scenario #%d:\n%d",k,count);break;}
            else if(f==1){printf("Scenario #%d:\nimpossible",k);break;}
            f-=1;
        }
        n--;k++;
        if(n) printf("\n\n");
    }
    return 0;
}

