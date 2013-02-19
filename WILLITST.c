#include<stdio.h>
int main()
{long long int n;
    scanf("%lld",&n);
    if(n%2!=0){
        printf("NIE\n");
        return 0;
    }
    while(n>1){
    if(n % 2 == 0) {
      n=n/2;  
    }
    else{
        printf("NIE");
        return 0;
    }
    }
   if(n==1)printf("TAK");
else printf("NIE");
return(0);
}
