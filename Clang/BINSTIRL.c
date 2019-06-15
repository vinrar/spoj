#include<stdio.h>
int main(){
    int t;
    long long int n,m;
    scanf("%d",&t);
    while(t){
        scanf("%lld",&n);
        scanf("%lld",&m);
        if( (n-m) & ((m-1)/2))printf("0");
        else printf("1");
        printf("\n");
    --t;
    }
    return 0;
}
