#include<stdio.h>
void fact(int);
int main(){
    int n,i;
     scanf("%d",&n);
    int a[n];
    i=n;
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
         fact(a[i]);
    }
return 0;
}
void fact(int num){
    int store,x,index=0,temp;
    if(num==2){printf("2\n");return;}
    if(num==1){printf("1\n");return;}
    if(num==3){printf("6\n");return;}
    int arr[161],i;
    arr[0]=1;
    for(i=1;i<161;i++){
        arr[i]=-1;
        
    }
    for(i=2;i<=num;i++)
     {   
         temp=0;index=0;
          while(arr[index] != -1){
            x = arr[index]*i+temp;
            temp=x/10;
            arr[index]=x%10;
            index=index+1;
            if(temp!=0 && arr[index]==-1){arr[index]=0;store=index;}
            
          }
     }
     for(i=store;i>=0;i--)
     {
         if(arr[i]!=-1)printf("%d",arr[i]);
         else break;
     }
printf("\n");
}


