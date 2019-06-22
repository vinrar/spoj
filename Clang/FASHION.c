#include<stdio.h>
 void fashion(int *, int *, int);
 int main()
{   int n,i,j,k;
    scanf("%d",&n);//number of test cases
    int a[1000],b[1000];
    for(i=0;i<n;i++){
        scanf("%d",&k);
        /*printf("k=%d\n",k);*/
        for(j=0;j<k;j++){
            scanf("%d",&a[j]);
            /*printf("a[j]= %d\n",a[j]);*/
        }
        for(j=0;j<k;j++){
            scanf("%d",&b[j]);
        }
        fashion(a,b,k);
    }
return 0;
}
void fashion(int a[], int b[], int ki){
    int sum=0,temp,i,j;
    for(i=0;i<ki;i++){
        for(j=i;j<ki;j++){
            if(a[j]>a[i]){temp=a[i];a[i]=a[j];a[j]=temp;}
        }
    }    
    for(i=0;i<ki;i++){
        for(j=i;j<ki;j++){
            if(b[j]>b[i]){temp=b[i];b[i]=b[j];b[j]=temp;}
        }
    }
    for(i=0;i<ki;i++){
        /*printf("%d ",b[i]);*/
        
        sum=sum+a[i]*b[i];
    }

printf("%d\n",sum);
}
