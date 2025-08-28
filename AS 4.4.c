//4. Print strong numbers in the given range 1 to n.

#include<stdio.h>
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	
int i;

for(i=1;i<=n;i++){
	int store=i;
	int sum=0;
	while(store>0){
		int a=store%10;		
		int fact=1;
		int j;
		for(j=1;j<=a;j++){
			fact=fact*j;
		}
		sum=sum+fact;
		store=store/10;
		
	}
	if(i==sum){
		printf("%d ",i);
	}

	
}
	}
	 
