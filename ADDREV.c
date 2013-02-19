#include<stdio.h>
int main(){
    int n,i;
    scanf("%d",&n);
    int a[n],b[n],x,y;
    int temp1=0,temp2=0;
    for(i=0;i<n;i++){
        scanf("%d %d",&a[i],&b[i]);
       /* printf(" sum : %d ",a[i]+b[i]);*/
    }    
    for(i=0;i<n;i++){
     temp1=0,temp2=0;
     x=a[i];y=b[i];
     /*printf(" %d:%d ",i+1,x);*/
    while(x){
        temp1=temp1*10+x%10;
        x=x/10;
    }/*printf(" temp1:%d ",temp1);*/
    while(y){
        temp2=temp2*10+y%10;
        y=y/10;
    }
    x=temp1+temp2;temp1=0;
    while(x){
        temp1=temp1*10+x%10;
        x=x/10;
    }
    printf("%d\n",temp1);
    }

return 0;
}

