#include<stdio.h>
int main(){int n,a,t,p;
long long int b;
scanf("%d",&n);
while(n){scanf("%d%lld",&a,&b);
t=a%10;
p=b%4;
if(b==0)printf("1");
else{if(t==1||t==5||t==6||t==0)printf("%d",t);
if(t==2){if(p==1)printf("2");
if(p==2)printf("4");
if(p==3)printf("8");
if(p==0)printf("6");}
if(t==3){if(p==1)printf("3");
if(p==2)printf("9");
if(p==3)printf("7");
if(p==0)printf("1");}
if(t==4||t==9)(p%2==1)?printf("%d",t):printf("%d",(t*t)%10);
if(t==7){if(p==1)printf("7");
if(p==2)printf("9");
if(p==3)printf("3");
if(p==0)printf("1");}
if(t==8){if(p==1)printf("8");
if(p==2)printf("4");
if(p==3)printf("2");
if(p==0)printf("6");}}
printf("\n");n--;}return 0;}
