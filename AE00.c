#include<stdio.h>
#include<math.h>


void fact(int);

int main(){
    int n;
    scanf("%d",&n);
    fact(n);
    return 0;
}
void fact(int n){
    if(n==1){printf("1");return;}
    if(n==2){printf("2");return;}
    int i,j,sum=0,s;
    for(j=3;j<=n;j++){
    s = sqrt(j);
    for(i=2;i<=s;i++){
    if(!(j%i)){
        sum=sum+1;
    }
    }
    }
    printf("%d",n+sum);
}

