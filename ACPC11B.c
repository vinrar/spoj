#include<stdio.h>
#include<math.h>
void mindist(long int *, int, long int *, int);
int main(){
    int n,i,j;
    long int a[1000],b[1000];
    scanf("%d",&n);
    while(n){
    int m,s;
    scanf("%d",&m);
      for(j=0;j<m;j++){
      scanf("%ld",&a[j]);
    }
    scanf("%d",&s);
    for(i=0;i<s;i++){
      scanf("%ld",&b[i]);
    }
    mindist(a,m,b,s);
    n--;
    }
return 0;
}
void mindist(long int a[], int m, long int b[], int s)
{
    int i,j,min=(a[0]-b[0]),m2;
    if(min<0)min=-1*min;
    if(min){
    for(i=0;i<m;i++){
        if(min){
            for(j=0;j<s;j++){
            if(min){
                m2 = a[i] - b[j];
                if(m2 < 0) m2 = -1 * m2;
                if(m2 < min) min = m2;
            }
        
        }
    }
    }
    }
    printf("%d\n",min);
}
