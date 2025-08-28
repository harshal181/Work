//3. Print perfect numbers in the given range 1 to n.

#include<stdio.h>
void main(){
 int n;
 printf("Enter the n:");
 scanf("%d",&n);
 
int i,j;
for(i=1;i<=n;i++){
	int sum=0;
	for(int j=1;j<i;j++){
		if(i%j==0){
			sum=sum+j;
		}
	}
	if(i==sum){
		printf("%d ",i);
	}
}


}